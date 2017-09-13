package Ex2;

public class Gerente extends Empregado {

    protected String nomeGerencia;

    @Override
    public String toString() {
        return "Gerente{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade +", salario=" + salario + ", matricula=" + matricula + ", nomeGerencia=" + nomeGerencia + ", INSS="+valorInss()+'}';
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

}
