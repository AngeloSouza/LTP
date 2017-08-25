package Ex2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("informe um numero inteiro: ");
        int primeiro = new Scanner(System.in).nextInt();
        System.out.println("informe o segundo numero inteiro: ");
        int segundo = new Scanner(System.in).nextInt();
        Intervalo cqd = new Intervalo(primeiro, segundo);
        System.out.println("");
        cqd.printImp();
    }

}
