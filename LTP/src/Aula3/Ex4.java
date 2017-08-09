
package Aula3;

import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        int[] a = new int[8];
        int[] posi = new int[8];
        int[] nega = new int[8];
        int flag=0;
        for (int i = 0; i < a.length; i++) {
            System.out.printf("informe o %d valor: ",i+1);
            a[i]=new Scanner(System.in).nextInt();
            if(a[i]>=0){
                flag++;
            }
            if(flag==8){
                System.out.println("\n nao pode ter todos os 8 numeros positivos ");
                System.out.printf("informe o %d valor: ",i+1);
                a[i]=new Scanner(System.in).nextInt();
            }
        }
        
        System.out.println("");
        int aux1=0,aux2=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=0){
               posi[aux1]=a[i];
               aux1++;
            }else{
                nega[aux2]=a[i];
                aux2++;
            }
        }
        System.out.println("\n negativos   positivos");
        for (int i = 0; i < a.length; i++) {
            System.out.printf(" %d             %d \n",nega[i],posi[i]);
        }

    }
}
