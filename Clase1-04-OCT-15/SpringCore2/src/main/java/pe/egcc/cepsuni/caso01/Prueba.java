package pe.egcc.cepsuni.caso01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba {

  public static void main(String[] args) {
    
    String xmlFile = "/pe/egcc/cepsuni/caso01/contexto.xml";
    
    //ApplicationContext  beanFactory;
    //beanFactory = new ClassPathXmlApplicationContext(xmlFile);
    
    BeanFactory beanFactory;
    beanFactory = new ClassPathXmlApplicationContext(xmlFile);
    
    Matematica bean;
    bean = beanFactory.getBean("panchito", Matematica.class);
    
    System.out.println("Suma = " + bean.sumar(5, 8));

  }
}
