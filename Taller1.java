package taller1;
import java.util.Scanner;
//taller numero1 Nixon Campoverde 21/04/17
public class Taller1 {

    // hacer un programa que me de el resultado del costo de un terreno
   
    public static void main(String[] args) {
        // creacion de variables para pedir al usuario
        Scanner datos = new Scanner(System.in);
        // creacion de las variables
        double anchuraterreno=0, costo=0, longitudterreno=0;
        double total=0;
        // solicitamos los valores de las varables al usuario
        System.out.print("Ingrese la anchura del terreno: \n");
        anchuraterreno=datos.nextDouble();
        System.out.print("Ingrese el valor por metro cuadrado: \n");
        costo=datos.nextDouble();
        System.out.print("Ingrese la longitud del terreno: \n");
        longitudterreno=datos.nextDouble();
        //operaciones
        total=(anchuraterreno*longitudterreno)*costo;
        // presentar en pantalla 
        System.out.print("El costo total es: "+total+"\n");
    }
    
}
