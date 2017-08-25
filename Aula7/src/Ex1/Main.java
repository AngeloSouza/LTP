
package Ex1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("digite uma frase: ");
        String frase=new Scanner(System.in).nextLine();
        Impressora imp=new Impressora(frase);
        imp.print();
    }
    
}
