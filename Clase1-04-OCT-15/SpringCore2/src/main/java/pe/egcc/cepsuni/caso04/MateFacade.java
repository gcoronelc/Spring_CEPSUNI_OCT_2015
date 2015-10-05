package pe.egcc.cepsuni.caso04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MateFacade {
  
  @Autowired
  private Matematica mate;
  
  public MateFacade() {
    System.out.println("Objeto MateFacade creado.");
  }
  
  public int sumar(int n1, int n2){
    return mate.sumar(n1, n2);
  }
  
}
