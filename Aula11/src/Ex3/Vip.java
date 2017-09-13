
package Ex3;

public class Vip extends Ingresso{
    protected double valorAdic;

    @Override
    public String toString() {
        return "valor ingreço(VIP): " + (valor+ valorAdic) ;
    }

    public double getValorAdic() {
        return valorAdic;
    }

    public void setValorAdic(double valorAdic) {
        this.valorAdic = valorAdic;
    }
    
}
