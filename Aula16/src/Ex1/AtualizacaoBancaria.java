
package Ex1;


public class AtualizacaoBancaria {
    private double saldoTotal=0;
    
    public void atualizando(Conta contas[],double taxa){
        Conta aux;
        double a1,a2;
        
        for (int i=0;i<contas.length;i++) {
            aux=contas[i];
            System.out.print("\n"+i+"-saldo anterior: "+aux.getSaldo());
            a1=aux.getSaldo();
            contas[i].atualizar(taxa);
            aux=contas[i];
            System.out.print("     saldo atual: "+aux.getSaldo());
            a2=aux.getSaldo();
            saldoTotal+=(a2-a1);
        }
        
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
}
