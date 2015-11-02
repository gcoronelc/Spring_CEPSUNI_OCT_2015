package pe.egcc.mvc01.service.api;

import java.util.List;
import java.util.Map;

public interface CuentaServiceApi {

  int obtenerCantCuentas();

  List<Map<String, Object>> obtenerCuentaResumen(String cuenta);

  void registrarDeposito(String cuenta, double importe, String codEmpleado);
}
