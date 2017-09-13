package Ex2;

public class Cliente extends Pessoa {

    protected int anoNasc;
    protected double valDivida;

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", anoNasc=" + anoNasc + ", valDivida=" + valDivida + '}';
    }
    
    public int getAnoNasc() {
        return anoNasc;
    }

    public double getValDivida() {
        return valDivida;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public void setValDivida(double valDivida) {
        this.valDivida = valDivida;
    }

}
