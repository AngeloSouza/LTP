package Ex3;

public class Inverso {

    String frase;

    public Inverso(String frase) {
        this.frase = frase;
    }

    public void inverter() {
        String aux=new StringBuffer(this.frase).reverse().toString();
        System.out.println(aux);
    }
    
}
