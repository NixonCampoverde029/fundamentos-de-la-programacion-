package deber.ejercicio.pkg5;
import java.util.Scanner;
public class DeberEjercicio5 {
//La velocidad de la luz es de 300 000 km por segundo. Elaborar un algoritmo
//Que lea un tiempo en segundos e imprima la distancia que recorre la luz en dicho tiempo.
  public static void main(String[] args) {
        // Creacion de variable para pedir por consola al usuario 
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        int segun=0, veloci, distancia=0;
                
        // Asignacion de variables
        veloci=300000;        
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese los segundos: \n");
        segun=datos.nextInt();
               
        // Realiza las operaciones
        distancia=veloci*segun;
        
        // se mostrara en pantalla 
        System.out.print("El recorrido total es: "+distancia+" kilometros \n");
    }
    
}