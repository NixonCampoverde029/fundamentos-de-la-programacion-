package deber.ejercicio.pkg13;
import java.util.Scanner;
public class DeberEjercicio13 {
   public static void main(String[] args) {
        // Creacion de variable para pedir por consola  al usuario
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double volumen=0,radio=0,area=0;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el valor del radio: \n");
        radio=datos.nextDouble();
                      
        // Realiza las operaciones
        area=3.14*(radio*radio);
        volumen=(4*3.14*(radio*radio*radio))/3;
        
        // Salida en pantalla
        System.out.print("El volumen sera : "+volumen+"\n");
        System.out.print("El area sera : "+area+"\n");
        
    }
    
}