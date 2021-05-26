package com.practica26.grupal;

import java.util.Scanner;

public class Ejercicio_4_ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite la cantidad de primos a ver en pantalla");
        int nPrimesNumber = scanner.nextInt();
        boolean bIsPrime = false;
        int counter = 0;
        int testNumber = 1;
        while(counter <= nPrimesNumber){
            bIsPrime = isPrime(testNumber);
            if (bIsPrime) {
                System.out.println(testNumber +" es primo");
                counter++;
                testNumber++;
            }
        }
        scanner.close();

    }

    public static boolean isPrime(int number){
        boolean isPrime_ = true;
        int contador = 2;
        while(isPrime_ && contador<number ){
            //System.out.println("contador: "+ contador + ", residuo "+ number %contador);
            isPrime_ = number % contador!=0;
            contador++;
        }

        //System.out.println("¿El numero " +number + " es primo? :: "+ isPrime_);
        return isPrime_;
    }


}
