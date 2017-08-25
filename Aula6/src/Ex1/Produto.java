
package Ex1;

public class Produto {
    String descricao;
    int cod;
    float preco;
    float percentual;
    float imposto;
    
    public void percentual(/*int cod*/){
        if (cod==1) {
            percentual=10; 
        }else{
            percentual=20; 
        }
    }
    
    public float imposto(/*float preco, float percentual*/){
        imposto=(preco*percentual)/100;
        return imposto;
    }
    
    public float calcularPreco(/*float preco, float imposto*/){
        float resp=preco+imposto;
        return resp;
    }
    
}
