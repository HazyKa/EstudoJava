package atividades17;

import java.util.Scanner;

public class nomeSenha {
        public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scan.nextLine();
        System.out.println("Digite sua senha");
        String senha = scan.nextLine();


        if(senha.equalsIgnoreCase(nome)){
            System.out.println("A senha nao pode ser o mesmo que o nome");
        } else {
            System.out.println("Concluido");
        }
    };

}
