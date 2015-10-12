package pe.egcc.cepsuni.caso05;

import org.springframework.stereotype.Component;

@Component
public class Matematica {
  
  public Matematica() {
    System.out.println("Objeto Matematica creado.");
  }
  
  public int sumar(int n1, int n2){
    return (n1 + n2);
  }

}
