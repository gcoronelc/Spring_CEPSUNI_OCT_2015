package pe.egcc.mvc01.service.api;

import java.util.List;

import pe.egcc.mvc01.model.ClienteBean;

public interface ClienteServiceApi {

  String traerNombre(String codigo);
  
  ClienteBean traerCliente(String codigo);

  List<ClienteBean> traerClientes(String nombre);
}
