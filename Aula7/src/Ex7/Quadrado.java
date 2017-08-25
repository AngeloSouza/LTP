
package Ex7;

public class Quadrado {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    public void area(){
        double aux=this.lado*this.lado;
        System.out.println(aux);
    }
    
    public void perimetro(){
        double aux=this.lado*4;
        System.out.println(aux);
    }
    
}
