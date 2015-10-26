package pe.egcc.mvc01.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.egcc.mvc01.dao.espec.EmpleadoDaoEspec;
import pe.egcc.mvc01.model.EmpleadoBean;
import pe.egcc.mvc01.service.api.EmpleadoServiceApi;

@Service
public class EmpleadoServiceImpl implements EmpleadoServiceApi {

  @Autowired
  private EmpleadoDaoEspec empleadoDao;
  
  @Override
  public EmpleadoBean validar(String usuario, String clave) {
    return empleadoDao.validar(usuario, clave);
  }

}
