
package Ex1;

public class ContaCorrente extends Conta{
    
    @Override
    public void atualizar(double taxa){
        this.saldo += (saldo*(taxa/100))*2;
    }
    
    @Override
    public void depositar(double valor){
        this.saldo += (valor-0.10);
    }
}
