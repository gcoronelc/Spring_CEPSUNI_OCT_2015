package pe.egcc.cepsuni.caso08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MateFacade {
  
  @Autowired
  @Qualifier(value="mate_b")
  private MatematicaApi mate;
  
  public int sumar(int n1, int n2){
    return mate.sumar(n1, n2);
  }
  
}
