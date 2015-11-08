package pe.egcc.mvc01.service.api;

import pe.egcc.mvc01.model.EmpleadoBean;

public interface EmpleadoServiceApi {

  
  EmpleadoBean validar(String usuario, String clave);
}
