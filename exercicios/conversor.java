package exercicios;

import java.util.Scanner;

public class conversor {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos metros quer converter para centimetros?");
        String metros = scan.nextLine();
        int metroNumero = Integer.parseInt(metros);
        int resultado = metroNumero * 100;
        System.out.println(resultado);
    }

}
