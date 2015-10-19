package pe.egcc.mvc01.service.impl;

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

}
