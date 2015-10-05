package pe.egcc.cepsuni.caso02;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named
public class Matematica {
  
  public Matematica() {
    System.out.println("Objeto creado.");
  }
  
  public int sumar(int n1, int n2){
    return (n1 + n2);
  }

}
