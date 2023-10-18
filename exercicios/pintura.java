package exercicios;

import java.util.Scanner;

public class pintura {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos metros deseja pintar?");
        String metrosPintar = scan.nextLine();
        float metros = Integer.parseInt(metrosPintar);
        float litrosDeTinta = metros / 3;
        System.out.println(litrosDeTinta);
    }
}
