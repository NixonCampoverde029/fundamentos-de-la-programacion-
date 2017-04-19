package deber.ejercicio.pkg17;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Scanner;
public class DeberEjercicio17 {
    //Elaborar un algoritmo que permita leer el tamaño de un angulo en radianes e imprima la tangente, secante , cosecante, cotangente 
  public static void main(String[] args) {
        // Creacion de variable para pedir por consola al usuario 
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double cotangente=0,tangente=0, cosecante=0,secante=0;
        double angulo=0;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el tamaño del angulo en radianes: \n");
        angulo=datos.nextDouble();
                      
        // Realizo las operaciones
        tangente=sin(angulo)/cos(angulo);
        cotangente=1/tangente;
        secante=1/cos(angulo);
        cosecante=1/sin(angulo);
        
        // Presentar en pantalla 
        System.out.print("La cosecante sera: "+cosecante+"\n");
        System.out.print("La cotangente sera: "+cotangente+"\n");
        System.out.print("La secante sera: "+secante+"\n");
        System.out.print("La tangente sera: "+tangente+"\n");
       
    }

   
    
}