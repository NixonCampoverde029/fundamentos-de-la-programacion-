package deberejercicio15;
import java.util.Scanner;
public class Deberejercicio15 {
    public static void main(String[] args) {
        // Creacion de variable para pedir por consola al usuario 
        Scanner datos = new Scanner(System.in);  
        
        // Creacion de variables
        double dolar=0;
        double cambiot=0, cambioz=0, cambiol=0, cambio2=0;
        double yenes=0, pesetas=0, libras=0,marcoss=0;
        
        // Solicitud de variables al usuario
        System.out.print("Ingrese los dolares: \n");
        dolar=datos.nextDouble();
        System.out.print("Ingrese el tipo de cambio a yenes: \n");
        cambiot=datos.nextDouble();
        System.out.print("Ingrese el tipo de cambio a pesetas: \n");
        cambioz=datos.nextDouble();
        System.out.print("Ingrese el tipo de cambio a libras: \n");
        cambiol=datos.nextDouble();
        System.out.print("Ingrese el tipo de cambio a marcos: \n");
        cambio2=datos.nextDouble();
                      
        // Realizo las operaciones
        yenes=dolar*cambiot;
        pesetas=dolar*cambioz;
        libras=dolar*cambiol;
        marcoss=dolar*cambio2;
        
        // en la pantalla se presentara
        System.out.print(+dolar+" dolares equivale a : \n");
        System.out.print(+yenes+" yenes \n");
        System.out.print(+pesetas+" pesetas \n");
        System.out.print(+libras+" libras \n");
        System.out.print(+marcoss+" marcos \n");
    }
    
}