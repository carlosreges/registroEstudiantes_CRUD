package logica;

public class Estudiante {
   String nombre;
   String dni;
   String email;
   private Carrera carrera;
   private int anio;

  public Estudiante() {}

  public Estudiante(String nombre, String dni, String email, Carrera carrera, int anio) {
    this.nombre = nombre;
    this.dni = dni;
    this.email = email;
    this.carrera = carrera;
    this.anio = anio;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Carrera getCarrera() {
    return carrera;
  }

  public void setCarrera(Carrera carrera) {
    this.carrera = carrera;
  }
   
   
}
