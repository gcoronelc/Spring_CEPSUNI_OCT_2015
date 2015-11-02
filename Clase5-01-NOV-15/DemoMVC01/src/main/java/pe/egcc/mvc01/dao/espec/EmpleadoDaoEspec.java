package pe.egcc.mvc01.dao.espec;

import pe.egcc.mvc01.model.EmpleadoBean;

public interface EmpleadoDaoEspec {

  EmpleadoBean validar(String usuario, String clave);
  
}
