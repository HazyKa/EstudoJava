package exercicios;
import java.util.Scanner;

public class variaveis {
        public static void main(String[] args){

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite um numero");
            String numero1 = scan.nextLine();
            int n1 = Integer.parseInt(numero1);
            System.out.println("Digite outro numero");
            String numero2 = scan.nextLine();
            int n2 = Integer.parseInt(numero2);

            System.out.println(n1 + n2);

        }
}