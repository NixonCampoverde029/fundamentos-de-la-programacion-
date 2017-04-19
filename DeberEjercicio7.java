package deber.ejercicio.pkg7;
import java.util.Scanner;
public class DeberEjercicio7 {
//Una temperatura en grados celsius (C) se puede convertir a su equivalente en faherenheit (F)
   public static void main(String[] args) {
        // Creacion de variable para pedir por consola al usuario
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double celsiusC=0, farenheitF=0;
              
        // Solicitud de variables al usuario
        System.out.print("Ingrese los grados Celsius: \n");
        celsiusC=datos.nextInt();
               
        // Realiza las operaciones
        farenheitF=(9/5)*celsiusC+32;
        
        // Presentar en pantalla 
        System.out.print(+celsiusC+" grados Celsius es igual a: "+farenheitF+" grados Farenheit\n");
    }
    
}