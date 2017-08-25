
package Ex3;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        System.out.println("digite uma frase: ");
        String frase=new Scanner(System.in).nextLine();
        Inverso inv=new Inverso(frase);
        System.out.println("");
        inv.inverter();
    }
    
}
