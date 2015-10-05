package pe.egcc.cepsuni.caso01;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component(value="panchito")
public class Matematica {
  
  public Matematica() {
    System.out.println("Objeto Matematica creado.");
  }
  
  
  @PostConstruct
  public void initBean(){
	  System.out.println("Post contructor.");
  }
  
  public int sumar(int n1, int n2){
    return (n1 + n2);
  }

}
