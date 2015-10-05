package pe.egcc.cepsuni.caso03;

public class MateFacade {

  private Matematica mate;
  private String nombre;
  
  public void setMate(Matematica mate) {
    System.out.println("Objeto Matematica inyectado.");
    this.mate = mate;
  }
  
  public void setNombre(String nombre) {
    System.out.println("Valor String inyectado.");
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return nombre;
  }
  
  public MateFacade() {
    System.out.println("Objeto MateFacade creado.");
  }
  
  public int sumar(int n1, int n2){
    return mate.sumar(n1, n2);
  }
  
}
