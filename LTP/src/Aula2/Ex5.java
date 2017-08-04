package Aula2;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("1.Imposto \n 2.Novo Salario \n 3.Classificaçao");
        
        System.out.print("informe a opçao: ");
        int cod = leia.nextInt();
        System.out.println("");
        float salario;
        do{
        System.out.print("Informe seu salario :");
        salario = leia.nextFloat();
        }while(salario < 0);
        double aux;
        String aux2;
        switch (cod) {
            case 1:
                if(salario<500){
                   aux=salario*0.05; 
                }else if(salario>=500 && salario<=850){
                    aux=salario*0.1; 
                }else{
                    aux=salario*0.15; 
                }
                System.out.println("o valor a pagar de imposto é "+aux);
                break;
            case 2:
                if(salario>1500){
                   aux=salario+25; 
                }else if(salario>=750 && salario<=1500){
                    aux=salario+50; 
                }else if(salario>=450 && salario<750){
                    aux=salario+75; 
                }else{
                    aux=salario+100;
                }
                System.out.println("o seu novo salario  é "+aux);
                break;
            case 3:
                if(salario>700){
                   aux2="bem remunerada"; 
                }else{
                    aux2="mal remunerada"; 
                }
                System.out.println("sua renda é "+aux2);
                break;
            default:
                System.out.println("opçao invalido");
        }

    }
}
