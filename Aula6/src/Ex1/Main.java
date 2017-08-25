package Ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Produto p[] = new Produto[5];
        float fin[]=new float[p.length];
        int cont=0;
        float med=0;
        for (int i = 0; i < p.length; i++) {
            p[i]=new Produto();
            System.out.println("\nInforme a descriçao do " + (i + 1) + " produto: ");
            p[i].descricao = new Scanner(System.in).nextLine();
            do {
                System.out.println("Informe o codigo do tipo do " + (i + 1) + " produto: (1 ou 2)");
                p[i].cod = new Scanner(System.in).nextInt();
            } while (p[i].cod != 2 && p[i].cod != 1);
            System.out.println("Informe o preço do " + (i + 1) + " produto: ");
            p[i].preco = new Scanner(System.in).nextFloat();
        }

        
        for (int j = 0; j < p.length; j++) {
            p[j].percentual();
            System.out.println("");
            System.out.println((j + 1) + "\n - Descriçao: " + p[j].descricao);
            System.out.println(" - Codigo : " + p[j].cod);
            System.out.println(" - Preço : " + p[j].preco);
            System.out.println(" - imposto : " + p[j].imposto());
            fin[j]=p[j].calcularPreco();
            System.out.println(" - total : " + p[j].calcularPreco());
        }
        
        for (int i = 0; i < fin.length; i++) {
            if (fin[i]>5.50){
                cont++;
            }
            med+=fin[i];
        }
        System.out.println("numero de produtos com valor total acima de R$:5,50 : "+cont);
        System.out.println("media de valor total: "+(med/fin.length));

    }

}
