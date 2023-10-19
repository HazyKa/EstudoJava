package atividades17;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o numero da tabuada desejada: ");
        int numero = scan.nextInt();

        for(int i = 0; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
