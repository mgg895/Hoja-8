public class Paciente implements Comparable<Paciente>{
  protected String nombre;
  protected String enfermedad;
  protected String codigoEmergencia;

    public Paciente(String nombre, String enfermedad, String codigoEmergencia){
    this.nombre = nombre;
    this.enfermedad = enfermedad;
    this.codigoEmergencia = codigoEmergencia;
  }
  
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  
  public String getNombre(){
    return nombre;
  }
  
  public void setEnfermedad(String enfermedad){
    this.enfermedad = enfermedad;
  }
  
  public String getEnfermedad(){
    return enfermedad;
  }
  
  public void setCodigoEmergencia(String codigoEmergencia){
    this.codigoEmergencia = codigoEmergencia;
  }
  
  public String getCodigoEmergencia(){
    return codigoEmergencia;
  }

   // Overriding the compare method to sort the age 

    /**
     *
     * @param P
     * @return
     */
      @Override
  public int compareTo(Paciente P){
    return (this.codigoEmergencia).compareTo(P.codigoEmergencia);
  }
}
