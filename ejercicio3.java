

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        // comprobar: numero / numero ==
        boolean isPrime = true;
        int contador = 2;


        while(isPrime && contador<numero ){

            System.out.println("contador: "+ contador+ ", residuo "+numero%contador);
            isPrime = numero%contador!=0;
            contador++;
        }

        System.out.println("¿El numero es primo?"+ isPrime);


        scanner.close();
    }
}
