package pe.egcc.cepsuni.caso05;

public class Equipo {
  
  private String gerente;
  private String jefe;
  private String analista;
  private String programador;
  
  public Equipo(String gerente, String jefe, String analista, String programador) {
    super();
    this.gerente = gerente;
    this.jefe = jefe;
    this.analista = analista;
    this.programador = programador;
  }
  
  public void showEquipo(){
    System.out.println("EL EQUIPO");
    System.out.println("Gerente: " + gerente);
    System.out.println("Jefe: " + jefe);
    System.out.println("Analista: " + analista);
    System.out.println("Programador: " + programador);
  }

}
