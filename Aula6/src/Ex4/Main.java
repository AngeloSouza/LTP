
package Ex4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Imovel imoveis[]=new Imovel[10];
        for (int i = 0; i < imoveis.length; i++) {
            imoveis[i]=new Imovel();
            System.out.println((i+1)+"- informe o tipo: ");
            imoveis[i].tipo=new Scanner(System.in).nextInt();
            if(imoveis[i].tipo==1){
                
            }
        }
    }
    
}
