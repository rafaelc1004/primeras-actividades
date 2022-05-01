
package proyectosaludo;

import java.util.Scanner;

public class ProyectoSaludo {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("\t\tAplicacion para Saludos en distintos idiomas");
        System.out.println("\t\t--------------------------------------------");
        
        System.out.println("1.- Saludo en Ingles");
        System.out.println("2.- Saludo en Frances");
        System.out.println("3.- Saludo en Espaniol");
        
        System.out.print("\nElija su Opcion :");
        int opcion = entrada.nextInt();
        
        if(opcion == 1){
            System.out.println("Good morning!!");
        }else if(opcion == 2){
            System.out.println("Bonjour!!");
        }else{
            System.out.println("Buenos Dias!!");
        }
    }
    
}
