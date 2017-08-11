package Ex3;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("informe a");
        int a = new Scanner(System.in).nextInt();
        System.out.println("informe b");
        int b = new Scanner(System.in).nextInt();
        System.out.println("informe c");
        int c = new Scanner(System.in).nextInt();
        if(a>0){
            System.out.println("R= "+FuncEx3.rotina(a, b, c));
        }
    }

}
