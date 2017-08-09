
package Aula3;

import java.util.Arrays;
import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        int[][] m = new int[2][2];
        int[][] r = new int[2][2];
        Random rand = new Random();
        
        for (int[] m1 : m) {
            for (int j = 0; j < m.length; j++) {
                m1[j] = rand.nextInt(26);
            }
        }      
        System.out.println("");
        int aux=0;
        int[] aux3=new int[4];
        for (int i = 0; i < aux3.length; i++) {
            for (int j = 0; j < aux3.length-1; j++) {
                aux3[aux+j]=m[i][j];
            }
            
        }
        for(int[] m1 : m ){
            System.out.println(Arrays.toString(m1));
        }
        
        for (int i = 0; i < aux3.length; i++) {
            for (int j = 0; j < aux3.length-1; j++) {
                if (aux3[j] > aux3[j + 1]) {
                    aux = aux3[j];
                    aux3[j] = aux3[j + 1];
                    aux3[j + 1] = aux;
                }
            }
        }
        //aux=aux3[3];
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r.length; j++) {
              r[i][j]=aux3[3]*m[i][j];
            }     
        }
        for(int[] r1 : r ){
            System.out.println(Arrays.toString(r1));
        }
        
    }
}
