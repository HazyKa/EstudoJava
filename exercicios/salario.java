package exercicios;

import java.util.Scanner;

public class salario {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto voce ganha por hora?");
        String ganhoTrabalhado = scan.nextLine();
        int ganho = Integer.parseInt(ganhoTrabalhado);
        System.out.println("Quantas horas voce trabalha por dia?");
        String horaTrabalhada = scan.nextLine();
        int hora = Integer.parseInt(horaTrabalhada);

        int horaMensal = hora * 22;
        int salario = horaMensal * ganho;

        System.out.println(salario);
    }
}
