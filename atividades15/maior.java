package atividades15;

import java.util.Scanner;

public class maior {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero1 = scan.nextInt();
        System.out.println("Digite outro numero");
        int numero2 = scan.nextInt();

        System.out.println(numero1 + numero2);

        if(numero1 > numero2){
            System.out.println("Jogador numero 1 ganhou!");
        } else {
            System.out.println("Jogador numero 2 ganhou!");
        }
    
    };


}
