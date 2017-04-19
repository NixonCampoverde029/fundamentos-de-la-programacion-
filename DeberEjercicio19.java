package deber.ejercicio19;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Scanner;
public class DeberEjercicio19 {
//Elaborar un algoritmo que permita leer el tamaño de un angulo en grados e imprima el seno y coseno.Debe comvertirse los grados leidos a radianes antes de hacer los calculos
     public static void main(String[] args) {
        // Creacion de variable para pedir por consola al usuario
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double radio=0, seno=0, coseno=0;
        double grados=0;
        // Solicitud de variables al usuario
        System.out.print("Ingrese el valor del angulo en grados: \n");
        grados=datos.nextDouble();
                      
        // Realizo las operaciones
        radio=grados*3.14/180;
        seno=sin(radio);
        coseno=cos(radio);
        
        // Salida en pantalla
        System.out.print("La seno sera: "+seno+"\n");
        System.out.print("La coseno sera: "+coseno+"\n");
        
       
    }
}