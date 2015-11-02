package pe.egcc.app.service;

import org.springframework.stereotype.Service;

import pe.egcc.app.model.VentaBean;

@Service
public class VentaService {

  public void procesar(VentaBean ventaBean){
    double importe;
    importe = ventaBean.getPrecio() * ventaBean.getCant();
    ventaBean.setImporte(importe);    
  }
  
}
