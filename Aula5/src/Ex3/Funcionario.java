
package Ex3;


public class Funcionario {
    public static final float PER=(float) 0.2;
    int cod;	
    String nome;	
    char sexo;
    float horasTrab; 
    float valH;
    
    public float salarioFinal(){
        float resp=horasTrab*valH;
        if(sexo=='f' || sexo=='F'){
            resp=(resp*PER)+resp;
        }
        return resp;
    }
}
