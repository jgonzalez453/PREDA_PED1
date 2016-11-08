import java.util.*;

/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    // instance variables - replace the example below with your own
    private EntradaConfig datosEntrada;
    private AlgoritmoDyV aDyV;
    //private BigInteger resultado;

    /**
     * Constructor for objects of class Principal
     */
    public Principal(String nombrearchivoentrada, boolean trazabilidad)
    {
        // initialise instance variables
        datosEntrada = new EntradaConfig(nombrearchivoentrada);
        /*if(datosEntrada.getOKentrada()){
            datosEntrada.print();
            calcularMultiplicacion(trazabilidad);
            print();
        }else{
            System.out.println("ARCHIVO DE ENTRADA NO VALIDO");
        }*/
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void calcularMultiplicacion(boolean trazabilidad)
    {
        // put your code here
        //aDyV = new AlgoritmoDyV(, trazabilidad);
        //resultado  = aDyV.ejecutarAlgoritmoDyV();
    }
    
  public void print()
  {
    System.out.println(this.toString());
  }
    
}
