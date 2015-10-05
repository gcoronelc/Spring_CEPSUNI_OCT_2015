package pe.egcc.cepsuni.caso04;

public class MateFacade {

  private Matematica mate;
  private String nombre;
  private Venta venta;
  
  public MateFacade(Matematica mate, String nombre, Venta venta) {
    super();
    System.out.println("Objeto MateFacade creado.");
    this.mate = mate;
    this.nombre = nombre;
    this.venta = venta;
  }

  public String getNombre() {
    return nombre;
  }
  
  public int sumar(int n1, int n2){
    return mate.sumar(n1, n2);
  }
  
  public double calcVenta(double precio, int cant){
    return venta.calcVenta(precio, cant);
  }
  
}
