import java.util.PriorityQueue;
public class Paciente<E> extends Comparable<E> implements PriorityQueue {
  public Paciente(String nombre, String enfermedad, char codigoEmergencia){
    this.nombre = nombre;
    this.enfermedad = enfermedad;
    this.codigoEmergencia = codigoEmergencia;
  }
  
  public setNombre(String nombre){
    this.nombre = nombre;
  }
  
  public getNombre(){
    return nombre;
  }
  
  public setEnfermedad(String enfermedad){
    this.enfermedad = enfermedad;
  }
  
  public getEnfermedad(){
    return enfermedad;
  }
  
  public setCodigoEmergencia(char codigoEmergencia){
    this.codigoEmergencia = codigoEmergencia;
  }
  
  public getCodigoEmergencia(){
    return codigoEmergencia;
  }
}
