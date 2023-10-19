package atividades17;

import java.util.Scanner;

public class paresImpares {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        int numPar = 0;
        int numImpar = 0;
        int num = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero: ");
            num = scan.nextInt();

            if(num % 2 == 0){
                numPar++;
            } else {
                numImpar++;
            }
        }
        
        System.out.println(numPar);
        System.out.println(numImpar);

    }
}
