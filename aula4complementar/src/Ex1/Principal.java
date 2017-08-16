
package Ex1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       float[] nota=new float[3];
       String aux;
        for (int i = 0; i < nota.length; i++) {
            System.out.printf("\ninforme a %d nota ",i+1);
            nota[i]=in.nextFloat();
        }
        do{
        System.out.println("escolha uma das opçoes \nA-media aritmetica  \nP-media ponderada(5/3/2) \n");
          aux=in.nextLine();
        }while(!"a".equals(aux) || !"p".equals(aux));
        
        if("a".equals(aux)){
            System.out.println("a media aritmetica é "+Fun.medArit(nota));
        }else{
            System.out.println("a media ponderada é "+Fun.medPond(nota));
        }
        
    }
    
}
