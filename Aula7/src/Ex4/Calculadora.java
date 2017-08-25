
package Ex4;

public class Calculadora {
    String op;
    int first;
    int second;

    public Calculadora(String op, int first, int second) {
        this.op = op;
        this.first = first;
        this.second = second;
    }
    
    public void calcular() {
        switch(this.op){
            case "+" :
                System.out.println(this.first+this.second);
                break;
            case "-" :
                System.out.println(this.first-this.second);
                break;
            case "*" :
                System.out.println(this.first*this.second);
                break;
            case "/" :
                System.out.println(this.first/this.second);
                break;
            default:
                System.out.println("operador invalido");
        }
        
    }
    
}
