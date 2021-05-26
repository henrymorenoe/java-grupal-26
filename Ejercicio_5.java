package com.practica26.grupal;


import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {

        /*
        Strategy:
        create the numbers decomposing numbers in its position value::
        124 :: ciento veinti cuatro
        1 centena + 2 decenas + 4 unidades := 124
        * */

        Scanner scanner = new Scanner(System.in);

        int nNumeros = scanner.nextInt();
        int mDigitos = scanner.nextInt();
        int dDigit = scanner.nextInt();

        int counterNumberOK= 0;
        int numberOK = 0;

        List<Integer> positionFromDecimalNumericSystem= new ArrayList<>();

        int position = 1;

        for(int i = 0; i<mDigitos; i++){
            numberOK = numberOK + (dDigit * position); // adding: unidades, decenas, centenas ... position in Decimal Numeric System
            position= position *10;
            counterNumberOK++;
        }
        System.out.println("Numero: "+ numberOK);

        int counter_position = 1;
        int minus1_Position = position -1 ;
        //int position_copy = position;
        while(counterNumberOK<= nNumeros){
            numberOK = numberOK + (1 * position);
            position= position *10;
            System.out.println("Numero: "+ numberOK);
            counterNumberOK++;

            counter_position = 1;
            while(counterNumberOK<= nNumeros || counter_position < dDigit){
                numberOK += position*counter_position;
                counter_position += 1;
                System.out.println("Numero: "+ numberOK);
                counterNumberOK++;
            }

            int auxiliar_digit = 0;
            while (counterNumberOK<= nNumeros || minus1_Position>0){

                numberOK += minus1_Position + auxiliar_digit*minus1_Position;
            }

        }





    }
}
