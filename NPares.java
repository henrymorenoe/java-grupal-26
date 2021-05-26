package practica1;

import java.util.Scanner;

public class NPares {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su numero");
        int numeroIngresado = scanner.nextInt();
        for(int i = 0; i < numeroIngresado; i = i+2) {
                System.out.println(i);
        }

        scanner.close();
    }
}
