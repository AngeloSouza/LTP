package Ex3;

import java.util.Scanner;

public class NPrimoLoop {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("Informe um numero: ");
            int num = leia.nextInt();
            System.out.println("");
            int cont = 0;
            if (num > 0) {
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
            } else if (num == 0) {
                flag = false;
            } else {
                System.out.println("porfavor digite um numero inteiro positivo");
            }
            System.out.println("");
        } while (flag);

    }
}
