
package Aula3;

import java.util.Scanner;

public class Ex2 {
    
    public int sort(int[] x,int[] y){
        int aux;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length-1; j++) {
                if (x[j] > x[j + 1]) {
                    aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < y.length; i++) {
            if(x[x.length-1]==y[i]){
               return i; 
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        Ex2 e=new Ex2();
        int[] quant = new int[10];
        float[] valor = new float[10];
        String[] nome=new String[10];
        float aumento=0;
        for (int i = 0; i < nome.length; i++) {
            System.out.print("informe o nome do produto: ");
            nome[i]= new Scanner(System.in).nextLine();
            System.out.print("\n informe a quantidade vendida: ");
            quant[i]= new Scanner(System.in).nextInt();
            System.out.print("\n informe o preço: ");
            valor[i]= new Scanner(System.in).nextFloat();
            System.out.println("");
            aumento+=(quant[i]*valor[i]);
        }
        System.out.println("");
        
        int aux=e.sort(quant,quant);
        System.out.printf("produto -- qtdVendida --valuni ----valTot\n");
        for (int i = 0; i < nome.length; i++) {  
            System.out.printf("%d . %s ------ %d ----------- %f --- %f ",i+1,nome[i],quant[i],valor[i],quant[i]*valor[i]);
        }
        System.out.printf("o produto mais vendido foi %d . %s ------ %d ----------- %f "
                + "\n",aux+1,nome[aux],quant[aux],valor[aux]);
        System.out.println("o funcionario recebeu um total de comiçao é: "+aumento*0.05);

    }
}
