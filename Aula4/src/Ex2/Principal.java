
package Ex2;
import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        System.out.println("informe o primeiro numero: ");
        int x=new Scanner(System.in).nextInt();
        System.out.println("informe o segundo: ");
        int y=new Scanner(System.in).nextInt();
        System.out.println("R= "+FuncEx2.soma(x, y));
    }
    
}
