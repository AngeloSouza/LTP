package Aula3;

import java.util.Random;

public class Ex1 {

    public static void main(String[] args) {
        int[] num = new int[9];
        for (int i = 0; i < num.length; i++) {
            Random rand = new Random();
            num[i]=rand.nextInt(26);
            System.out.printf(" %d - %d  \n", i + 1,num[i]);
        }
        
        System.out.println("");
        
        for (int i = 0; i < num.length; i++) {
            if((num[i]%2)!=0){
               System.out.printf(" %d - %d  \n", i + 1,num[i]); 
            }
        }

    }
}
