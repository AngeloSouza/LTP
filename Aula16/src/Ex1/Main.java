
package Ex1;


public class Main {

    public static void main(String[] args) {
        AtualizacaoBancaria att=new AtualizacaoBancaria();
        Banco contas=new Banco();
        ContaCorrente c=new ContaCorrente();
        ContaPoupanca p=new ContaPoupanca();
        
        c.setSaldo(500);
        p.setSaldo(500);
        
        contas.adicionaConta(c);
        contas.adicionaConta(p);
        
        att.atualizando(contas.getContas(), 20);
        System.out.println("\n"+att.getSaldoTotal());
       
    }
    
}
