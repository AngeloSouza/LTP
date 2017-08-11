
package Ex5;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("informe preço antigo");
        float velho = new Scanner(System.in).nextFloat();
        System.out.println("informe preço novo");
        float novo = new Scanner(System.in).nextFloat();
        System.out.println("teve um almento de "+FuncEx5.funcao(velho, novo));
    }
    
}
