package Exemplo;

public class Vendedor extends Funcionario{

    private double SalarioBase, Comissao;

    public Vendedor() {
        super();
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setComissao(double Comissao) {
        this.Comissao = Comissao;
    }

    public double getComissao() {
        return Comissao;
    }

    @Override
    public double calcularSalarioFinal() {
        return SalarioBase + Comissao;
    }

}
