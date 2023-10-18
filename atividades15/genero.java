package atividades15;

import java.util.Scanner;

public class genero {
        public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Se for homem digite H se for mulher digite M");
        String genero = scan.nextLine().substring(0, 1);

        if(genero.equalsIgnoreCase("H")){
            System.out.println("E homi");
        } else {
            System.out.println("E muie");
        }
    };

}
