package atividades19;

import java.util.Scanner;

public class multiplosDeCinco {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] numeros = {1, 25, 54, 65, 42, 70, 76, 95 ,64, 29};


        int soma = 0;

        for(int num : numeros){
            if(num % 5 == 0){
                System.out.print(num + " e divisivel por cinco " );
                soma += num;
            }else {
                System.out.println(num + " nao e divisivel");
            }
        }

        System.out.println(soma);
    }
}
    