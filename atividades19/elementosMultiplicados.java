package atividades19;

import java.util.Scanner;

public class elementosMultiplicados {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int[] numerosA = new int[8];
    numerosA[0] = 5;
    numerosA[1] = 10;
    numerosA[2] = 15;
    numerosA[3] = 20;
    numerosA[4] = 25;

    int[] numerosB = new int[numerosA.length];

    for(int i = 0; i < 5; i++){
        numerosB[i] = numerosA[i];
    }

    for(int i = 0; i < 5; i++){
        System.out.println(numerosB[i] * 2);
    }

    };
}
