
package Ex1;
import java.util.Scanner;
public class Principal {

    
    public static void main(String[] args) {
        System.out.println("informe um numero");
        int num = new Scanner(System.in).nextInt();
        System.out.println("r= "+FuncEx1.retorno(num));
    }
    
}
