//Practica2 condicional

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    int  num1, num2;
    //entrada
    System.out.print("Digite primer numero: ");
    num1 = scanner.nextInt();
    System.out.print("Digite el segundo numero ");
    num2 = scanner.nextInt();
    // condicionar 
    if (num1 > num2){
        System.out.print("El primer numero es mayor : ");
    }  else if (num1 > num2) {
        System.out.print("El segundo numero es mayor : ");
    }  else {
        System.out.print("Ambos son Iguales : ");
    }
    scanner.close();
   }
}
    
