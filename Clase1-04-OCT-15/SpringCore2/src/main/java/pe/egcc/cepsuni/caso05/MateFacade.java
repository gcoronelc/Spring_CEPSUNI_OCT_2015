package pe.egcc.cepsuni.caso05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MateFacade {
  
  
  private Matematica mate;
  
  public MateFacade() {
  }
  
  @Autowired
  public MateFacade(Matematica mate) {
    System.out.println("Objeto MateFacade creado.");
    this.mate = mate;
  }
  
  public int sumar(int n1, int n2){
    return mate.sumar(n1, n2);
  }
  
}
