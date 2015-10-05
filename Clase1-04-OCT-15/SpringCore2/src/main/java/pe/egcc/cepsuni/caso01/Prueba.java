package pe.egcc.cepsuni.caso01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba {

  public static void main(String[] args) {
    
    String xmlFile = "/pe/egcc/cepsuni/caso01/contexto.xml";
    BeanFactory beanFactory;
    beanFactory = new ClassPathXmlApplicationContext(xmlFile);
    
    Matematica bean;
    bean = beanFactory.getBean("panchito", Matematica.class);
    
    System.out.println("Suma = " + bean.sumar(5, 8));

    
  }
}
