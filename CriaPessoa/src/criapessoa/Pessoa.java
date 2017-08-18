/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criapessoa;

import java.util.Scanner;

public class Pessoa {
    String nome;
    String rg;
    int idade;
    
    public static void andar(){
        Scanner in=new Scanner(System.in);
        int opcao;
        do {
            System.out.println("digite a opçao desejada \n1-direita \n2-esquerda \n3-frente \n4-tras");
            opcao=in.nextInt();
            switch (opcao){
                case 1:{
                    System.out.println("ande para a direita");
                  break;  
                }
                case 2:{
                    System.out.println("ande para a esquerda");
                  break;  
                }
                case 3:{
                    System.out.println("ande para a frente");
                  break;  
                }
                case 4:{
                    System.out.println("volte");
                  break;  
                }
                default:{
                    System.out.println("opçao invalida");
                }
                
            }
        }while(true);
    }
    
}
