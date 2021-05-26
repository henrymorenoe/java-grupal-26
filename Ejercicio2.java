package practica1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de multiplos");
        int multiplos = scanner.nextInt();
        System.out.println("Ingrese numero");
        int numero = scanner.nextInt();

        int cont = 1;
        while(cont <= multiplos) {
                System.out.println(cont * numero);
        cont ++;
        }
        scanner.close();
    }
}
