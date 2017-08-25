
package Ex4;

import java.util.Scanner;

public class Main4 {

   
    public static void main(String[] args) {
        System.out.println("informe um numero inteiro: ");
        int primeiro = new Scanner(System.in).nextInt();
        System.out.println("informe o segundo numero inteiro: ");
        int segundo = new Scanner(System.in).nextInt();
        System.out.println("informe a operaçao");
        String op=new Scanner(System.in).next();
        Calculadora cal=new Calculadora(op, primeiro, segundo);
        System.out.println("");
        cal.calcular();
    }
    
}
