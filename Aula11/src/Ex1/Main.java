
package Ex1;


public class Main {

    public static void main(String[] args) {
        Funcionario f=new Funcionario();
        Assistente as=new Assistente();
        Gerente g=new Gerente();
        Tecnico t=new Tecnico();
        Administrativo a=new Administrativo();
        
        f.setCpf(35468);
        f.setNome("funcionario");
        f.setRg("5435483");
        
        g.setCpf(35147684);
        g.setNome("gerente");
        g.setRg("54233546");
        g.setNivel(1);
        
        as.setCpf(3598426);
        as.setNome("assistente");
        as.setRg("546351465");
        as.setNumMatri(1);
        
        t.setCpf(75846);
        t.setNome("tecnico");
        t.setRg("3354887");
        t.setNumMatri(2);
        t.setBonus((float) 0.05);
        
        a.setCpf(94682);
        a.setNome("administrativo");
        a.setRg("846759");
        a.setNumMatri(3);
        a.setAdNot((float) 0.1);
        a.setTurno("noite");
        
        f.exibir();
        System.out.println(g.toString());
        System.out.println(t.toString());
        System.out.println(a.toString());
       
    }
    
}
