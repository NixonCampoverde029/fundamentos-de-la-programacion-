package deber.ejercicio11;
import java.util.Scanner;
public class DeberEjercicio11 {
    public static void main(String[] args) {
        // hacemos la creacion de variables para pedir por consola
        Scanner datos = new Scanner(System.in);
        // creacion de variables 
         double dolar=0, cambio=0, pesos=0;
         // soicitamos las variables al usuario 
         System.out.print("Ingrese la cantidad  dolar: \n");
         dolar=datos.nextDouble();
         System.out.print("Ingrese el tipo cambio: \n");
         cambio=datos.nextDouble();
         // realizamos las operaciones
         pesos=dolar*cambio;
         //la salida en la pantalla sera  
         System.out.print(+dolar+" dolares equivale a: "+pesos+" pesos \n");
        
    }
    
}
