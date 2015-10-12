package pe.egcc.cepsuni.caso06;

import javax.inject.Named;

@Named
public class Matematica {
  
  public Matematica() {
    System.out.println("Objeto Matematica creado.");
  }
  
  public int sumar(int n1, int n2){
    return (n1 + n2);
  }

}
