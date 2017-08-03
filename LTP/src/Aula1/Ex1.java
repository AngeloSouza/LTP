
package Aula1;
import java.util.Scanner;
/*
 * @author Angelo
 */
public class Ex1 {
    public static void main(String[] args){
        Scanner leia  = new Scanner(System.in);
        System.out.println("calculadora de volume de cilindro");
        System.out.println("");
        System.out.print("informe a altura: ");
        float a=leia.nextFloat();
        System.out.print("informe o raio: ");
        float r=leia.nextFloat();
        double v=3.1415*r*r*a;
        System.out.println("o volume é: "+v);
        
    }
}
