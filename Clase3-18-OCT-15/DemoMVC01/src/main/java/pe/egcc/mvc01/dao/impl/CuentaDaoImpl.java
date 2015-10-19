package pe.egcc.mvc01.dao.impl;

import org.springframework.stereotype.Repository;

import pe.egcc.mvc01.dao.espec.CuentaDaoEspec;

@Repository
public class CuentaDaoImpl extends AbstractDaoSupport implements CuentaDaoEspec {

  @Override
  public int cantCuentas() {
    String sql = "select count(*) from cuenta";
    int cont = jdbcTemplate.queryForObject(sql, Integer.class);
    return cont;
  }

}
