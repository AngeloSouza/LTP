package Exemplo;

public class FreeLancer extends Funcionario{

    private int DiasTrabalhados;
    private double ValorDia;

    public FreeLancer() {
        super();
    }

    public void setDiasTrabalhados(int DiasTrabalhados) {
        this.DiasTrabalhados = DiasTrabalhados;
    }

    public int getDiasTrabalhados() {
        return DiasTrabalhados;
    }

    public double getValorDia() {
        return ValorDia;
    }

    public void setValorDia(double ValorDia) {
        this.ValorDia = ValorDia;
    }

   
    @Override
    public double calcularSalarioFinal() {
        return DiasTrabalhados * ValorDia;
    }

}
