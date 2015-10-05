package pe.egcc.cepsuni.caso06;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

@Named
public class MateFacade {
  
  @Inject
  private Matematica mate;
  
  public MateFacade() {
  }
  
  public MateFacade(Matematica mate) {
    System.out.println("Objeto MateFacade creado.");
    this.mate = mate;
  }
  
  public int sumar(int n1, int n2){
    return mate.sumar(n1, n2);
  }
  
}
