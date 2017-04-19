package deber.ejercicio.pkg1;
import java.util.Scanner;
public class DeberEjercicio1 {
//Elaborar un algoritmo que calcule e imprima el costo de produccion de un articulo, teniendo como datos la descripccion y el numero 
//de unidades producidas. El costo se calcula multiplicando el numero de unidades producidas por un factor de costo de materiales de 3.5
//Y sumandole el producto un costo fijo de 10 700.
    public static void main(String[] args) {
       
        // Creacion de variable para pedir por consola al usuario 
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double costofijo=0, costomateriales=0, total=0; 
        int cantidad=0;
        
        // Asignacion de variables
        costomateriales=3.5;
        costofijo=10700;        
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese el numero de unidades que se van a producir: \n");
        cantidad=datos.nextInt();
               
        // Realiza las operaciones
        total=costomateriales*cantidad+costofijo;
        
        // Salida en pantalla
        System.out.print("El costo total sera: "+total+"\n");
        
    }
    
}