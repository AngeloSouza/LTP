
package Ex1;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Aluno aux=new Aluno();
        int num=0;
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        do{
        System.out.println("informe o nome: ");
        String nome=new Scanner(System.in).nextLine();
        System.out.println("informe a idade: ");
        int idade=new Scanner(System.in).nextInt();
        num++;
        aux.geraMat(nome, idade, num);
        alunos.add(aux);
        }while(num<5);
        System.out.println("");
        
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
    
}
