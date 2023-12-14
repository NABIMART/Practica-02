//practica2 condicional1

import java.util.Scanner;

public class Condicional {
    static String red = "\033[31m";
    static String green  = "\033[32m";
    
     static String reset = "\u001BCLS[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //Variable
        float ingreso;
        float irp = 800000000;
        //Entrada
        System.out.print(reset + "Digite el ingreso anual: ");
        ingreso = scanner.nextFloat();
        //Condicionar 
        if (ingreso > irp){
            System.out.print( red + "Debe bonar IRP el siguiente año");
        }  else {
            System.out.print(green + "No abonar IRP");
        }
        scanner.close ();
         System.out.print(reset);

    }
}
