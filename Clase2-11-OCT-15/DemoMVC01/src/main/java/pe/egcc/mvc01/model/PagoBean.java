package pe.egcc.mvc01.model;

public class PagoBean {

  // Datos
  private Integer horasDia;
  private Integer dias;
  private Double pagoHora;
  // Resultado
  private Double ingresos;
  private Double renta;
  private Double neto;

  public PagoBean() {
  }

  public Integer getHorasDia() {
    return horasDia;
  }

  public void setHorasDia(Integer horasDia) {
    this.horasDia = horasDia;
  }

  public Integer getDias() {
    return dias;
  }

  public void setDias(Integer dias) {
    this.dias = dias;
  }

  public Double getPagoHora() {
    return pagoHora;
  }

  public void setPagoHora(Double pagoHora) {
    this.pagoHora = pagoHora;
  }

  public Double getIngresos() {
    return ingresos;
  }

  public void setIngresos(Double ingresos) {
    this.ingresos = ingresos;
  }

  public Double getRenta() {
    return renta;
  }

  public void setRenta(Double renta) {
    this.renta = renta;
  }

  public Double getNeto() {
    return neto;
  }

  public void setNeto(Double neto) {
    this.neto = neto;
  }

}
