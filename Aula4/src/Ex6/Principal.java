
package Ex6;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
     System.out.println("d 1 a 9 ");
     int num = new Scanner(System.in).nextInt();
     if(num>0 && num<10){
         FuncEx6.nulo(num);
     }
    }
    
}
