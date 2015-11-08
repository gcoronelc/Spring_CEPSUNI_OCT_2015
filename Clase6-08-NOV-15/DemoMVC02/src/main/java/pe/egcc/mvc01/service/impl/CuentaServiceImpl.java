package pe.egcc.mvc01.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.egcc.mvc01.dao.espec.CuentaDaoEspec;
import pe.egcc.mvc01.service.api.CuentaServiceApi;

@Service
public class CuentaServiceImpl implements CuentaServiceApi{

  @Autowired
  private CuentaDaoEspec cuentaDao;
  
  @Override
  public int obtenerCantCuentas() {
    return cuentaDao.cantCuentas();
  }

  @Override
  public List<Map<String, Object>> obtenerCuentaResumen(String cuenta) {
    return cuentaDao.obtenerDatosCuenta(cuenta);
  }

  @Override
  public void registrarDeposito(String cuenta, double importe,
      String codEmpleado) {
    cuentaDao.grabarDeposito(cuenta, importe, codEmpleado);
  }

}
