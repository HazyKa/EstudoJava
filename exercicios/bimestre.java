package exercicios;
import java.util.Scanner;

public class bimestre {
        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite a primeira nota");
            String numero1 = scan.nextLine();
            int n1 = Integer.parseInt(numero1);
            System.out.println("Digite a segunda nota");
            String numero2 = scan.nextLine();
            int n2 = Integer.parseInt(numero2);
            System.out.println("Digite a terceira nota");
            String numero3 = scan.nextLine();
            int n3 = Integer.parseInt(numero3);
            System.out.println("Digite a quarta nota");
            String numero4 = scan.nextLine();
            int n4 = Integer.parseInt(numero4);

            System.out.println((n1 + n2 + n3 + n4) / 4);

        }
}