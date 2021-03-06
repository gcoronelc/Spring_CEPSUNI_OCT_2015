package pe.egcc.app.model;

public class VentaBean {

  
  private double precio;
  private int cant;
  private double importe;
  
  public VentaBean() {
  }

  public VentaBean(double precio, int cant, double importe) {
    this.precio = precio;
    this.cant = cant;
    this.importe = importe;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCant() {
    return cant;
  }

  public void setCant(int cant) {
    this.cant = cant;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }
  
}
