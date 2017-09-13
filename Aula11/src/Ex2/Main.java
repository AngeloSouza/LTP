
package Ex2;

public class Main {

    static void ini(Cliente c,Gerente g,Vendedor v) {
        c.setNome("cliente");
        c.setAnoNasc(1995);
        c.setIdade(22);
        c.setSexo("Masculino");
        c.setValDivida(15);
        
        g.setNome("gerente");
        g.setIdade(30);
        g.setSexo("Masculino");
        g.setMatricula("56468");
        g.setSalario(4300);
        g.setNomeGerencia("dono da porra toda");
        
        v.setNome("vendedor");
        v.setIdade(25);
        v.setSexo("F");
        v.setMatricula("354687");
        v.setSalario(3300);
        v.setQtdVendas(50);
        v.setValorVendas(5000);
        
    }

    
    public static void main(String[] args) {
        Cliente c=new Cliente();
        Gerente g=new Gerente();
        Vendedor v=new Vendedor();
        ini(c,g,v);
        
        System.out.println(c.toString());
        System.out.println(g.toString());
        System.out.println(v.toString());
       
    }
    
}
