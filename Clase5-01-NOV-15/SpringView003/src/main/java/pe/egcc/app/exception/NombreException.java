package pe.egcc.app.exception;

public class NombreException extends RuntimeException{

  private static final long serialVersionUID = 1L;

  public NombreException() {
    this("Nombre del estudiante debe tener como minimo 5 caracteres.");
  }

  public NombreException(String message) {
    super(message);
  }
  
  
}
