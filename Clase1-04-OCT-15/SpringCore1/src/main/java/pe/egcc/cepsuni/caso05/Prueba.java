package pe.egcc.cepsuni.caso05;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prueba {

  public static void main(String[] args) {
    
    String xmlFile = "/pe/egcc/cepsuni/caso05/contexto.xml";
    BeanFactory beanFactory;
    beanFactory = new ClassPathXmlApplicationContext(xmlFile);
    
    Equipo bean;
       
    bean = beanFactory.getBean(Equipo.class);
    bean.showEquipo();       
  }
}
