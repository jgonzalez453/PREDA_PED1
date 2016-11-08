import java.io.*;
import java.util.*;


/**
 * Esta clase se usa para la lectura parcial de archivos de entrada 
 * Solamente lee los datos de configuración, es decir el número de kilometros máximos sin repostar del vehiculo y 
 * el número de gasolineras en el recorrido.
 * 
 * @author José Luis González Muñiz
 * @version 1.00
 */
public class EntradaConfig
{
  //Variable archivo de entrada
  private File archivo;
  //Variable usadas para la lectura de el archivo de entrada y la correcta utilización de los datos
  private FileReader fr;
  private BufferedReader br;
  
  //Contructor
  /**
   * Este es el contructor de la clase encargada de leer la configuración de los archios de entrada
   */
  //public EntradaConfig(File archivo)
  public EntradaConfig(String nombrearchivoentrada)
  {
      //this.archivo = archivo;
      this.archivo = new java.io.File(nombrearchivoentrada);
      fr = null;
      br = null;
      leerConfig();
  }

  //Métodos de la clase
  
  /**
   * Este método lee los datos del archivo de entrada, pero solo los datos de configuración, es decir el número de 
   * máximo de Kilometros sin repostar por vehículo y el número total de gasolineras en la ruta
   */
  private void leerConfig()
  {
   try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         // Lectura del fichero por lineas y asignación a variable de datos leeidos
         String linea;
         String opeA = "";
         String opeB = "";
         int lineaNum = 1;
         while(((linea=br.readLine()) != null)){
           if(linea.trim().isEmpty())
           {
           }
           else
           {
               linea = linea.replaceAll("\\s{2,}", " ").trim();
               if(lineaNum == 1 && linea.trim().contains(" "))
               {
                   opeA = linea.split(" ")[0];
                   opeB = linea.split(" ")[1];
                   break;
               }else
               {
                   if(lineaNum == 1)
                   {
                       opeA = linea;
                   }else{
                       linea = linea.replaceAll("\\s","").trim();
                       opeB = linea;
                   }
               }
               lineaNum = lineaNum+1;
            }
         }
         System.out.println("MULTIPLICANDO A = "+opeA);
         System.out.println("MULTIPLICANDO B = "+opeB);
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
  }

  
 
}
