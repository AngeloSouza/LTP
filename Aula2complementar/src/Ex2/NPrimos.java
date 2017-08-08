package Ex2;

import java.util.Scanner;

public class NPrimos {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int num = leia.nextInt();
        System.out.println("");
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            System.out.println("O numero é primo");
        } else {
            System.out.println("O numero nao é primo");
        }

    }
}
