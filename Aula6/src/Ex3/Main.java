
package Ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Funcionario f=new Funcionario();
        System.out.println("informe o codigo do funcionario: ");
        f.cod= new Scanner(System.in).nextInt();
        System.out.println("informe o nome do funcionario: ");
        f.nome= new Scanner(System.in).nextLine();
        System.out.println("informe o sexo do funcionario: ");
        f.sexo= new Scanner(System.in).next().charAt(0);
        System.out.println("informe a quantidade de horas trabalhadas: ");
        f.horasTrab= new Scanner(System.in).nextFloat();
        System.out.println("informe o valor da hora: ");
        f.valH= new Scanner(System.in).nextFloat();
        
        System.out.println("\nO salario total é: "+f.salarioFinal());
    }
    
}
