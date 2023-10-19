package atividades19;

import java.util.Scanner;

public class somaElementos {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] numeros = {1, 24, 54, 65, 42, 67, 76, 92 ,64, 29};

        int soma = 0;

        for(int num : numeros){
            soma += num;
        }

        System.out.println(soma);
    }
}
