package pe.egcc.cepsuni.caso07;

import javax.inject.Inject;
import javax.inject.Named;
import javax.annotation.Resource;

@Named
public class MateFacade {
  
  @Inject
  @Resource(name="matematica2")
  private MatematicaApi mate;
  
  public int sumar(int n1, int n2){
    return mate.sumar(n1, n2);
  }
  
}
