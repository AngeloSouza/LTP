
package Ex4;

public class Imovel {
    int tipo;
    int codPro;
    int cod;
    String quadra;
    String lote;
    String area;
    float valVen;
    int sit;
    float iptu;
    
    public void calcIptu(){
        if(tipo==1){
           iptu=(float) (valVen*0.02);
        }else{
           iptu=(float) (valVen*0.01);
        }
    }
}
