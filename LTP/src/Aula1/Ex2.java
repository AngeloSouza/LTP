
package Aula1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner leia  = new Scanner(System.in);
        System.out.print("informe a temperatura em Fahrenheit : ");
        float f=leia.nextFloat();
        float c=(f-32)*5/9;
        System.out.printf("a temperatura em graus ceulcios é: %f, ",(c));
        
    }
    
}
