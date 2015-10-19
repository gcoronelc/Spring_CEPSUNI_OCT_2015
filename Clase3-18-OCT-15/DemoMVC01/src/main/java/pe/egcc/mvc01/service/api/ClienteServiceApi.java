package pe.egcc.mvc01.service.api;

import pe.egcc.mvc01.model.ClienteBean;

public interface ClienteServiceApi {

  String traerNombre(String codigo);
  
  ClienteBean traerCliente(String codigo);
}
