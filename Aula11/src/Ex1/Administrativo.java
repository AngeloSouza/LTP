package Ex1;

public class Administrativo extends Assistente {

    protected String turno;
    protected float adNot;

    @Override
    public String toString() {
        return "Administrativo{" +"cpf=" + cpf + ", nome=" + nome + ", rg=" + rg +", numero matricula="+numMatri+ ", turno=" + turno + ", adNot=" + adNot + '}';
    }
    
    

    public float calcAdicional(float salario) {
        float resp = (float) (salario * this.adNot);
        return resp;
    }

    public String getTurno() {
        return turno;
    }

    public float getAdNot() {
        return adNot;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setAdNot(float adNot) {
        this.adNot = adNot;
    }
    
}
