package Ex1;

public class Banco {

    
    public Conta contas[]=new Conta[2];

    
    
    public Conta[] getContas() {
        return contas;
    }

    public Conta pegaConta(int x) {
        return contas[x];
    }

    public int pegaTotalContas() {
        int cont = 0;
        for (Conta conta : contas) {
            if (conta == null) {
                break;
            } else {
                cont++;
            }
        }
        return cont;
    }

    public void adicionaConta(Conta c) {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i] == null) {
                contas[i] = c;
            }
        }
    }
}
