
package Aula1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ex4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("informe o valor de A ");
        int a=leia.nextInt();
        System.out.println("informe o valor de B ");
        int b=leia.nextInt();
        
        a+=b;
        b=a-b;
        a=a-b;
                

        System.out.print("A é: "+ a +" e B é: "+ b);
    }
}
