package Ex1;

public class Gerente extends Funcionario {

    protected int nivel;
   

    public float aumento(float salario) {
        float resp = (float) (salario + (salario * 0.15));
        return resp;
    }

    @Override
    public String toString() {
        return "Gerente{" + "cpf=" + cpf + ", nome=" + nome + ", rg=" + rg + ", nivel=" + nivel + '}';
    }
    

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
