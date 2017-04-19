package deber.ejercicio.pkg9;
import java.util.Scanner;
public class DeberEjercicio9 {
//Elaborar un algoritmo que lea un articulo y su costo la utildad es el 150% y el impuesto es el 15%
//Calcule e imprima articulo, utilidad, impuesto y presio de venta.
   public static void main(String[] args) {
        // Creacion de variable para pedir por consola al usuario 
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double costo,impuesto,utilidad, precio;
        double  impuestototal=0,utilidadtotal;
        String articulo;
        
        // Asignacion de variables
        impuesto=0.15;
        utilidad=1.5;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el nombre del articulo: \n");
        articulo=datos.next();
        System.out.print("Ingrese el costo del articulo: \n");
        costo=datos.nextDouble();
               
        // Realiza las operaciones
        impuestototal=costo*impuesto;
        utilidadtotal=costo*utilidad;
        precio=costo+utilidadtotal+impuestototal;
        
        // Presentar en pantalla 
        System.out.print("El articulo "+articulo+" tiene una utilidad de "+utilidadtotal+",\n");
        System.out.print("un impuesto de "+impuestototal+" y un precio de venta de "+precio+"\n");
    }
    
}
