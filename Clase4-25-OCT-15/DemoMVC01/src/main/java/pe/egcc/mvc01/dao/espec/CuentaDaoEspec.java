package pe.egcc.mvc01.dao.espec;

import java.util.List;
import java.util.Map;

public interface CuentaDaoEspec {
  
  int cantCuentas();
  
  List<Map<String,Object>> obtenerDatosCuenta(String cuenta);

  void grabarDeposito(String cuenta, double importe, String codEmpleado);
  
}
