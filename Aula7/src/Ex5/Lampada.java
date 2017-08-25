package Ex5;

public class Lampada {

    boolean ligada;

    public void liga() {
        this.ligada = true;
    }

    public void desliga() {
        this.ligada = false;
    }

    public void observa() {
        if (this.ligada == true) {
            System.out.println("ligada");
        } else {
            System.out.println("Desligada");
        }
    }
}
