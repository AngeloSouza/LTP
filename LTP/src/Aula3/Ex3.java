
package Aula3;

import java.util.Random;


public class Ex3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];
        for (int i = 0; i < a.length; i++) {
            Random rand = new Random();
            a[i]=rand.nextInt(26);
            b[i]=rand.nextInt(26);
            System.out.printf(" %d - %d / %d \n", i + 1,a[i],b[i]);
        }
        
        System.out.println("");
        
        for (int i = 0; i < c.length; i++) {
            if(i<10){
               c[i]=a[i];
            }else{
                c[i]=b[i-10];
            }
        }
        
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

    }
}
