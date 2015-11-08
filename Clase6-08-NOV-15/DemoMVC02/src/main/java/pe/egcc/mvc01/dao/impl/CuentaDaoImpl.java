package pe.egcc.mvc01.dao.impl;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import pe.egcc.mvc01.dao.espec.CuentaDaoEspec;

@Repository
public class CuentaDaoImpl extends AbstractDaoSupport implements CuentaDaoEspec {

  @Override
  public int cantCuentas() {
    String sql = "select count(*) from cuenta";
    int cont = jdbcTemplate.queryForObject(sql, Integer.class);
    return cont;
  }

  @Override
  public List<Map<String, Object>> obtenerDatosCuenta(String cuenta) {
    String sql = "WITH "
        + "V1 AS ( "
        + "SELECT "
        + "CUENTA, ACCION, SUM(IMPORTE) IMPORTE "
        + "FROM V_RESUMEN "
        + "WHERE CUENTA = ? "
        + "GROUP BY CUENTA, ACCION) "
        + "SELECT "
        + "V1.CUENTA, C.DEC_CUENSALDO SALDO, V1.ACCION, V1.IMPORTE "
        + "FROM CUENTA C JOIN V1 "
        + "ON C.CHR_CUENCODIGO = V1.CUENTA";
    Object[] args = {cuenta};
    List<Map<String, Object>> lista;
    lista = jdbcTemplate.queryForList(sql, args);
    return lista;
  }

  @Override
  @Transactional(rollbackFor=Exception.class)
  public void grabarDeposito(String cuenta, double importe, String codEmpleado) {
    // Leer datos de la cuenta
    System.out.println("Hora (" + importe + "): " + Calendar.getInstance().getTime());
    String sql = "select DEC_CUENSALDO, INT_CUENCONTMOV "
        + "from cuenta where CHR_CUENCODIGO = ? "
        + "for update";
    Object[] args = {cuenta};
    Map<String, Object> rec = jdbcTemplate.queryForMap(sql, args);
    int cont = Integer.parseInt(rec.get("INT_CUENCONTMOV").toString());
    double saldo = Double.parseDouble(rec.get("DEC_CUENSALDO").toString());
    System.out.println("Cont (" + importe + "): " + cont);
    System.out.println("Hora (" + importe + "): " + Calendar.getInstance().getTime());
    // Actualizar la cuenta
    cont++;
    saldo += importe;
    sql = "update cuenta "
        + "set DEC_CUENSALDO = ?, "
        + "INT_CUENCONTMOV = ? "
        + "where CHR_CUENCODIGO = ?";
    args = new Object[]{saldo,cont,cuenta};
    jdbcTemplate.update(sql, args);
    // Registrar el movimiento
    sql = "insert into movimiento(CHR_CUENCODIGO,INT_MOVINUMERO,DTT_MOVIFECHA,"
        + "CHR_EMPLCODIGO,CHR_TIPOCODIGO,DEC_MOVIIMPORTE) "
        + "values(?,?,SYSDATE,?,'003',?)";
    args = new Object[]{cuenta,cont,codEmpleado,importe};
    jdbcTemplate.update(sql, args);
  }

}
