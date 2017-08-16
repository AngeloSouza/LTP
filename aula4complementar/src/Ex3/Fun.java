
package Ex3;

import java.util.Scanner;

public class Fun {
    
    public static int[] dados(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.printf("\ninforme o %d numero: ",i+1);
            x[i]=new Scanner(System.in).nextInt();
        }
        return x;
    }
    
    public static int[] ordenar(int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length - 1; j++) {
                if (x[j] > x[j + 1]) {
                    int aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                }
            }
        }
        return x;
    }
    
    public static int retMen(int[] x){
        x=Fun.ordenar(x);
        return x[0];
    }
    
    public static int retMai(int[] x){
        x=Fun.ordenar(x);
        return x[x.length-1];
    }
    
}
