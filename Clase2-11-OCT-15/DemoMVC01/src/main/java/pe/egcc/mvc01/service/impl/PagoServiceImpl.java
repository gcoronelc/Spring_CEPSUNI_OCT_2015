package pe.egcc.mvc01.service.impl;

import org.springframework.stereotype.Service;

import pe.egcc.mvc01.model.PagoBean;
import pe.egcc.mvc01.service.api.PagoServiceApi;

@Service
public class PagoServiceImpl implements PagoServiceApi {

  @Override
  public void procesar(PagoBean pagoBean) {
    // Variables
    Double ingresos, renta, neto;
    // Proceso
    ingresos = pagoBean.getHorasDia() * 
        pagoBean.getDias() * pagoBean.getPagoHora();
    if(ingresos > 1500.0){
      renta = ingresos * 0.10;
    } else {
      renta = 0.0;
    }
    neto = ingresos - renta;
    // Salida
    pagoBean.setIngresos(ingresos);
    pagoBean.setRenta(renta);
    pagoBean.setNeto(neto);
  }

}
