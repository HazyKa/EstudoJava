package atividades19;

import java.util.Scanner;

public class elementosPares {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] numeros = {1, 24, 54, 65, 42, 67, 76, 92 ,64, 29};

        for(int num : numeros){
            if(num % 2 == 0){
                System.out.println(num + " e par");
            }else {
                System.out.println(num + " nao e par");
            }
        }
    }
}
