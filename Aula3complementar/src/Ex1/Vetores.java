package Ex1;


public class Vetores {

    public static void main(String[] args) {
        int[] num1 = new int[4];//alterar para 10
        int[] num2 = new int[4];
        int aux[];
        num1=Func.preencher(num1.length);
        num2=Func.preencher(num2.length);
        for (int i = 0; i < num1.length; i++) {   
            System.out.printf(" %d - %d / %d  \n", i + 1, num1[i], num2[i]);
        }

        System.out.println("\na uniao dos conjuntos: \n");
        aux=Func.uniao(num1, num2);
        for (int i = 0; i < aux.length; i++) {
            System.out.print(" "+aux[i]);
        }

        System.out.println("\n\na diferença entre x e y: ");
        aux=Func.dife(num1, num2);
        for (int i = 0; i < aux.length; i++) {
            System.out.print(" "+aux[i]);
        }    
        
        System.out.println("\n\na soma dos vetores: ");
        for (int i = 0; i < num1.length; i++) {
            System.out.print(" "+(num1[i] + num2[i]));
        }
        System.out.println("\n\no produto dos vetores: ");
        for (int i = 0; i < num1.length; i++) {
            System.out.print(" "+num1[i] * num2[i]);
        }
        
        System.out.println("\n\na intersecçao dos vetores: ");
        aux=Func.inter(num1, num2);
        for (int i = 0; i < aux.length; i++) {
            System.out.print(" "+aux[i]);
        }
        System.out.println("");

    }
}
