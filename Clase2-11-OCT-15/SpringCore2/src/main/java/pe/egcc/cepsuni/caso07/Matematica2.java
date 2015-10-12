package pe.egcc.cepsuni.caso07;

import javax.inject.Named;

@Named
public class Matematica2 implements MatematicaApi{

  @Override
  public int sumar(int n1, int n2) {
    int suma;
    suma = (n1 + n2) * (n1 - n2);
    return suma;
  }

}
