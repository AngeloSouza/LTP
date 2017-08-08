package Ex4;

import java.util.Scanner;

public class MedMaiMen {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Func f=new Func();
        int[] num=new int[10];
         for (int i = 0; i < 10; i++) {
                System.out.printf("informe o %d numero(inteiro): ", i+1);
                num[i] = leia.nextInt();
        }
        System.out.println("");
        System.out.printf(" a media dos numeros é %d \n o menor numero é %d \n o maior numero é %d \n"
                ,f.media(num),f.maimen(num, 0),f.maimen(num, 1));

    }
}
