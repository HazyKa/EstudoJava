package atividades17;

import java.util.Scanner;

public class menorMaiorSoma {
     public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        int menor = 0;
        int maior = 0;
        int soma = 0;
        int num = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Escreva um numero: ");
            num = scan.nextInt();

            if(num < menor) {
                menor = num;
            }else if (num > maior){
                maior = num;
            }
            soma = soma + num;
        }

        System.out.println(soma);
        System.out.println(menor);
        System.out.println(maior);
    };
}
