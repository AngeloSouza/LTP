package Ex1;

public class Tecnico extends Assistente {

    /**
     *
     */
    protected float bonus;

    @Override
    public String toString() {
        return "Tecnico{" +"cpf=" + cpf + ", nome=" + nome + ", rg=" + rg +", numero matricula="+numMatri+ ", bonus=" + bonus + '}';
    }
    

    public float novoSal(float salario) {
        float resp = (float) (salario+(salario * this.bonus));
        return resp;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    
}
