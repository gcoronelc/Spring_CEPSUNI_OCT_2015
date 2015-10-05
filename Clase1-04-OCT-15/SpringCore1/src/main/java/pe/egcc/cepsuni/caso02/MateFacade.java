package pe.egcc.cepsuni.caso02;

public class MateFacade {

  private Matematica mate;
  
  public void setMate(Matematica mate) {
    System.out.println("Objeto Matematica inyectado.");
    this.mate = mate;
  }
  
  
  public MateFacade() {
    System.out.println("Objeto MateFacade creado.");
  }
  
  public int sumar(int n1, int n2){
    return mate.sumar(n1, n2);
  }
  
}
