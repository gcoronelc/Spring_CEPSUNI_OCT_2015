package pe.egcc.cepsuni.caso08;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="mate_b")
public class Matematica2 implements MatematicaApi{

  @Override
  public int sumar(int n1, int n2) {
    int suma;
    suma = (n1 + n2) * (n1 - n2);
    return suma;
  }

}
