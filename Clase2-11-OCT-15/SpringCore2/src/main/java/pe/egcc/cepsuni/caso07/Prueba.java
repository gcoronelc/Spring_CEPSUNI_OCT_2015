package pe.egcc.cepsuni.caso07;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba {

  public static void main(String[] args) {
    
    String xmlFile = "/pe/egcc/cepsuni/caso07/contexto.xml";
    ConfigurableApplicationContext context;
    context = new ClassPathXmlApplicationContext(xmlFile);
    
    MateFacade bean;
    bean = context.getBean(MateFacade.class);
    
    System.out.println("Suma = " + bean.sumar(15, 8));
    
    context.close();

  }
}
