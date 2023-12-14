import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caracter;
        
        System.out.println("Programa java Condicional String ");
        System.out.print("Tipee un caracter: ");
        caracter = scanner.nextLine();

        if (caracter.length() != 1) {
            System.out.println("El carácter no es válido.");
        } else if ((caracter.compareTo("A") >= 0) && (caracter.compareTo("Z") <= 0)) {
            System.out.println("El caracter es una mayúscula!");
        } else {
            System.out.println("El caracter no es una mayúscula!");
        }

        scanner.close();
    }
}
