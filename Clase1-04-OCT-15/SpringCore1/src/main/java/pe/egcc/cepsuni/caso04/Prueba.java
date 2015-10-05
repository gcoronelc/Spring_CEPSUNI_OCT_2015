package pe.egcc.cepsuni.caso04;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba {

  public static void main(String[] args) {
    
    String xmlFile = "/pe/egcc/cepsuni/caso04/contexto.xml";
    BeanFactory beanFactory;
    beanFactory = new ClassPathXmlApplicationContext(xmlFile);
    
    MateFacade bean;
       
    bean = beanFactory.getBean(MateFacade.class);
    System.out.println("Suma = " + bean.sumar(5, 8));
    System.out.println("Nombre = " + bean.getNombre());
    System.out.println("Venta = " + bean.calcVenta(456.78, 10));
       
  }
}
