
package Ex1;


public class ContaPoupanca extends Conta{
    
    @Override
    public void atualizar(double taxa){
        this.saldo += (saldo*(taxa/100))*3;
    }
}
