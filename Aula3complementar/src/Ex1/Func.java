package Ex1;

import java.util.Random;
import java.util.ArrayList;

public class Func {

    public static int[] uniao(int[] x, int[] y) {
        int[] z = new int[x.length + y.length];
        for (int i = 0; i < x.length; i++) {
            z[i] = x[i];
            z[i + x.length] = y[i];
        }
        z = Func.ordenar(z);
        return z = Func.rednd(z);
    }

    public static int[] ordenar(int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length - 1; j++) {
                if (x[j] > x[j + 1]) {
                    int aux = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = aux;
                }
            }
        }
        return x;

    }

    public static int[] rednd(int[] x) {
        ArrayList<Integer> y = new ArrayList();
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    break;
                } else {
                    y.add(x[i]);
                    break;
                }
            }
        }
        y.add(x[x.length-1]);
        int[] z = new int[y.size()];
        for (int i = 0; i < z.length; i++) {
            z[i] = y.get(i);
        }
        return z;
    }

    public static int[] preencher(int x) {
        Random rand = new Random();
        int[] aux = new int[x];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = rand.nextInt(10);
        }
        return aux;
    }

    public static int[] dife(int[] x, int[] y) {
        ArrayList<Integer> z = new ArrayList();
        for (int i = 0; i < x.length; i++) {
            int flag=0;
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    flag=0;
                    break;
                } else {
                   flag++;
                }
            }
            if (flag!=0) {
                 z.add(x[i]);
            }
        }
        int[] w = new int[z.size()];
        for (int i = 0; i < w.length; i++) {
            w[i] = z.get(i);
        }
        w=Func.rednd(w);
        return w;
    }

    public static int[] inter(int[] x, int[] y) {
        ArrayList<Integer> z = new ArrayList();
        x=Func.rednd(x);
        y=Func.rednd(y);
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if(x[i]==y[j]){
                    z.add(x[i]);
                    break;
                }
            }
        }
        int[] w = new int[z.size()];
        for (int i = 0; i < w.length; i++) {
            w[i] = z.get(i);
        }
        return w;
    }
}
