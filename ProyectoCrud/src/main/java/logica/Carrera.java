package logica;

public class Carrera {
  private String nombreCarrera;
  private int duracionCarrera;

  public Carrera() {}

  public Carrera(String nombreCarrera, int duracionCarrera) {
    this.nombreCarrera = nombreCarrera;
    this.duracionCarrera = duracionCarrera;
  }

  public String getNombreCarrera() {
    return nombreCarrera;
  }

  public void setNombreCarrera(String nombreCarrera) {
    this.nombreCarrera = nombreCarrera;
  }

  public int getDuracionCarrera() {
    return duracionCarrera;
  }

  public void setDuracionCarrera(int duracionCarrera) {
    this.duracionCarrera = duracionCarrera;
  }
  
  
}
