package pe.egcc.app.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import pe.egcc.app.model.VentaBean;

public class VentaValidator implements Validator{

  @Override
  public boolean supports(Class<?> clazz) {
    return VentaBean.class.equals(clazz);
  }

  @Override
  public void validate(Object target, Errors errors) {
    VentaBean ventaBean = (VentaBean) target;
    
    if(ventaBean.getPrecio() <= 0){
      Object[] args = {"Precio"};
      errors.rejectValue("precio", "field.venta.invalidValue",args,"Precio es incorrecto.");
    }
    
    if(ventaBean.getCant() <= 0){
      Object[] args = {"Cantidad"};
      errors.rejectValue("cant", "field.venta.invalidValue",args,"Cantidad es incorrecta.");
    }
    
  }

}
