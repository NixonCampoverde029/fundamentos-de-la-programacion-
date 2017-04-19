package taller2;
import java.util.Scanner;
 // Nixon Campoverde 12-04-2017
public class Taller2 {
// programa que me imprima las horas en minutos, segundos y dias 
    public static void main(String[] args) {
        // creacion de las variables que se le pedira al usuario
        Scanner datos = new Scanner(System.in);
        // creacion de las varables
        int hora=0, segundos=0, minutos=0;
        double dias=0;
        
        // pedimos el ingreso de variables al usuario
        System.out.print("Introduzca el numero de horas a convertir: \n");
        hora=datos.nextInt();
        
        //realizo las operaciones
        
        minutos=hora*60;
        segundos=hora*3600;
        dias=hora/24;
        //la salsida en la pantalla sera 
        System.out.print(+hora+" horas son: "+minutos+" minutos \n");
        System.out.print(+hora+" horas son: "+segundos+" segundos \n");
        System.out.print(+hora+" horas son: "+dias+" dias \n");
        
        
      
    }
    
}
