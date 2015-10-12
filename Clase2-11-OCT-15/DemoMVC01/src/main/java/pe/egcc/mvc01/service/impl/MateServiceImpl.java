package pe.egcc.mvc01.service.impl;

import org.springframework.stereotype.Service;

import pe.egcc.mvc01.service.api.MateServiceApi;

@Service
public class MateServiceImpl implements MateServiceApi {

  @Override
  public int sumar(int n1, int n2) {
    int r;
    r = n1 + n2;
    return r;
  }

  @Override
  public int calcularMcd(int n1, int n2) {
    while(n1 != n2){
      if(n1 > n2){
        n1 -= n2;
      } else {
        n2 -= n1;
      }
    }
    return n1;
  }

}
