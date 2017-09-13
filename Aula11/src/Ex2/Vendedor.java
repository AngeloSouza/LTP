package Ex2;

public class Vendedor extends Empregado {

    protected double valorVendas;
    protected int qtdVendas;

    @Override
    public String toString() {
        return "Vendedor{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade +", salario=" + salario + ", matricula=" + matricula + ", valorVendas=" + valorVendas + ", qtdVendas=" + qtdVendas + '}';
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

}
