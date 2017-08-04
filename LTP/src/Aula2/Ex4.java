package Aula2;

import java.io.PrintStream;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("informe seu codigo: ");
        int cod = leia.nextInt();
        System.out.print("\n informe o seu salario: ");
        float salario = leia.nextFloat();
        double salAt = 0;
        String cargo = null;
        switch (cod) {
            case 1:
                cargo = "Escrituario";
                salAt = salario + (salario * 0.5);
                break;
            case 2:
                cargo = "Secretario";
                salAt = salario + (salario * 0.35);
                break;
            case 3:
                cargo = "caixa";
                salAt = salario + (salario * 0.2);
                break;
            case 4:
                cargo = "gerente";
                salAt = salario + (salario * 0.1);
                break;
            case 5:
                cargo = "diretor";
                salAt = salario;
                break;
            default:
                System.out.println("codigo invalido");
        }
        if (cod > 0 && cod < 6) {
            System.out.printf("seu cargo %s teve um almento de %f e seu salario ficou em R$:%f", cargo, (salAt - salario), salAt);
        }

    }
}
