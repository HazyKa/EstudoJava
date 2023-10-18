package atividades15;

import java.util.Scanner;

public class investigacao {
        public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vitima? Sim ou Nao");
        String telefonou = scan.nextLine().substring(0, 1);
        System.out.println("Esteve no local do crime? Sim ou Nao");
        String local = scan.nextLine().substring(0, 1);;
        System.out.println("Mora perto da vitima? Sim ou Nao");
        String mora = scan.nextLine().substring(0, 1);;
        System.out.println("Devia para a vitima? Sim ou Nao");
        String devia = scan.nextLine().substring(0, 1);;
        System.out.println("Ja trabalhou com a vitima? Sim ou Nao");
        String trabalhou = scan.nextLine().substring(0, 1);;

        int variavel = 0;

        if(telefonou.equalsIgnoreCase("S")){
            variavel++;
        }
        if (local.equalsIgnoreCase("S")){
            variavel++;
        }
        if (mora.equalsIgnoreCase("S")){
            variavel++;
        }
        if (devia.equalsIgnoreCase("S")){
            variavel++;
        }
        if (trabalhou.equalsIgnoreCase("S")){
            variavel++;
        }


        System.out.println(variavel);
    };

}
