package Exemplo;

public class ExemploPolimorfismoEmpresa {

    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        FreeLancer f = new FreeLancer();

        v.setNome("Carlos");
        v.setSalarioBase(2000);
        v.setComissao(3000);

        System.out.printf("\nSalário do vendedor: R$ %.2f\n", obterSalarioDoFuncionario(v));

        f.setNome("Clara");
        f.setDiasTrabalhados(20);
        f.setValorDia(150);

        System.out.printf("Salário da freelancer: R$ %.2f\n\n", obterSalarioDoFuncionario(f));

    }

    public static double obterSalarioDoFuncionario(Funcionario funcionario) {

        double resposta = funcionario.calcularSalarioFinal();
        return resposta;
    }

}
