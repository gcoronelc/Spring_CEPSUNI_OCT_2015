package pe.egcc.cepsuni.caso08;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
@Qualifier(value="mate_a")
public class Matematica1 implements MatematicaApi{
    
  @Override
  public int sumar(int n1, int n2){
    return (n1 + n2);
  }

}
