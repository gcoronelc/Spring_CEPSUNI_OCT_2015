package pe.egcc.mvc01.dao.espec;



import java.util.List;

import pe.egcc.mvc01.model.ClienteBean;

public interface ClienteDaoEspec {

  String obtenerNombre(String codigo);
  
  ClienteBean obtenerCliente(String codigo);
  
  List<ClienteBean> obtenerClientes(String nombre);
  
}
