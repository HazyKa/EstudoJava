package atividades17;

import java.util.Scanner;

public class pessoa {
        public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome (mais de 3 letras)");
        String nome = scan.nextLine();
        System.out.println("Digite sua idade (de 0 a 120)");
        int idade = scan.nextInt();
        System.out.println("Digite seu salario (maior que zero)");
        int salario = scan.nextInt();
        System.out.println("Digite seu estado civil (casado, viuvo, solteiro, divorciado)");
        String estado = scan.nextLine();
        System.out.println("Digite seu genero (escreva h ou m)");
        String genero = scan.nextLine();


        if(nome.length() < 3 || idade >= 120 || salario == 0){
            System.out.println("ta errado algo ai truta");
        }

        if(genero.equalsIgnoreCase("m")){
            System.out.println("e muie");
        } else if (genero.equalsIgnoreCase("h")){
            System.out.println("e home");
        } else {
            System.out.println("genero invalido");
        }

    };

}
