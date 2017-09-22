
package Ex2;


public class Medio extends Funcionario{
    protected String escola,categoria;
    public Medio() {
        super();
        this.salario+=this.salario*0.5;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
