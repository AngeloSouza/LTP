
package Ex1;


public class Funcionario {
   protected int cpf;
   protected String nome, rg;

   
   public void exibir(){
       System.out.println(toString());
   }

    @Override
    public String toString() {
        return "Funcionario{" + "cpf=" + cpf + ", nome=" + nome + ", rg=" + rg + '}';
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
   
   
}
