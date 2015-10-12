package pe.egcc.cepsuni.caso07;

import javax.inject.Named;

@Named
public class Matematica1 implements MatematicaApi{
    
  @Override
  public int sumar(int n1, int n2){
    return (n1 + n2);
  }

}
