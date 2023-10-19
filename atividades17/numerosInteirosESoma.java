package atividades17;

import java.util.Scanner;

public class numerosInteirosESoma {
        public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2 = scan.nextInt();

        int num;

        int numerosSomados = 0;

        if(numero1 < numero2) {
            
            while(numero1 < numero2) {
                num = numero1 + 1;
                ++numero1;
                System.out.println(num);

                numerosSomados = numerosSomados + num;
            }

        } else if(numero1 > numero2) {

            while(numero1 > numero2) {
                num = numero2 + 1;
                ++numero2;
                System.out.println(num);

                numerosSomados = numerosSomados + num;
            }

        }
        System.out.println("Somado e: " + numerosSomados);

    };

}
