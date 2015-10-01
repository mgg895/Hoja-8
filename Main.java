/*
 *Algoritmos y Estructura de Datos
 *Hoja de Trabajo 8
 *Ricardo Galindo - 14225
 *Daniel Smith - 14089
 */
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

public class Main {
    public static void main(String[] args){
		String[] vectorPacientes = new String[5];
		int n = 0;
		
		File archivo = null;
		FileReader fr = null;
		  BufferedReader br = null;
	 
		  try {
			 archivo = new File("Pacientes.txt");
			 fr = new FileReader (archivo);
			 br = new BufferedReader(fr);
	 
			 String linea = "a";
			 for(int i = 0; linea != null; i++){
				linea = br.readLine();
				vectorPacientes[i] = linea;
			 }
		  }
		  catch(Exception e){
			 e.printStackTrace();
		  }finally{
			 try{                    
				if( null != fr ){   
					fr.close();     
				}                  
			}catch (Exception e2){ 
				e2.printStackTrace();
			}
		}
		
        List<Paciente> paciente = new ArrayList<>();
		for (int i = 0; i < 4; i++){
			String paciente_lectura = vectorPacientes[i];
			String[] paciente_vector = paciente_lectura.split(", ");
			paciente.add(new Paciente(paciente_vector[0], paciente_vector[1], paciente_vector[2]));
		}
        
        Collections.sort(paciente);
        
        for(Paciente a : paciente){
            System.out.println("Nombre: " + a.getNombre() + ", Enfermedad: " + a.getEnfermedad() + ", Tipo Enfermedad: " + a.getCodigoEmergencia());
        }
    }
}
