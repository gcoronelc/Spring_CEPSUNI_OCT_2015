package pe.egcc.mvc01.dao.espec;

import pe.egcc.mvc01.model.ClienteBean;

public interface ClienteDaoEspec {

  String obtenerNombre(String codigo);
  
  ClienteBean obtenerCliente(String codigo);
  
}
