
package Ex2;


public class Basico extends Funcionario{
    protected String escola;
    public Basico() {
        super();
        this.salario+=this.salario*0.1;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
    
}
