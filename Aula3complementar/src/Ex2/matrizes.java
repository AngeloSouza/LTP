package Ex2;

import java.util.Random;

public class matrizes {

    public static void main(String[] args) {
        int[][] num1 = new int[4][5];
        int[][] num2 = new int[5][2];
        int[][] resp = new int[4][2];
        Random rand = new Random();
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                num1[i][j] = rand.nextInt(10);
                System.out.print(num1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2[i].length; j++) {
                num2[i][j] = rand.nextInt(10);
                System.out.print(num2[i][j]+" ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < resp.length; i++) {
            for (int j = 0; j < resp[i].length; j++) {
                
            }
            
        }

    }
}
