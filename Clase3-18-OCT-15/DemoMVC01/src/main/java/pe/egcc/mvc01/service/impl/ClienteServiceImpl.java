package pe.egcc.mvc01.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.egcc.mvc01.dao.espec.ClienteDaoEspec;
import pe.egcc.mvc01.model.ClienteBean;
import pe.egcc.mvc01.service.api.ClienteServiceApi;

@Service
public class ClienteServiceImpl implements ClienteServiceApi{

  @Autowired
  private ClienteDaoEspec clienteDao;
  
  @Override
  public String traerNombre(String codigo) {
    return clienteDao.obtenerNombre(codigo);
  }

  @Override
  public ClienteBean traerCliente(String codigo) {
    return clienteDao.obtenerCliente(codigo);
  }

}
