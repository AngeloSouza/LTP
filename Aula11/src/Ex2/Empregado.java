package Ex2;

public class Empregado extends Pessoa {

    protected double salario;
    protected String matricula;

    public double valorInss(){
        double resp=this.salario+(this.salario*0.11);
        return resp;
    }
    
    public double getSalario() {
        return salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
