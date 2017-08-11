
package Ex6;


public class FuncEx6 {
    public static void nulo(int x){
        for (int i = 1; i <= x; i++) {
            for (int j = i; j <= x; j++) {
                System.out.print(" "+i*j);
            }
            System.out.println("");
        }
    }
}
