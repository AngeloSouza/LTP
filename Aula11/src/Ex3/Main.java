
package Ex3;

public class Main {

    
    public static void main(String[] args) {
       Ingresso i=new Ingresso();
       Vip v=new Vip();
       MeiaEntrada m=new MeiaEntrada();
       
       i.setValor(22);
       v.setValor(22);
       v.setValorAdic(5);
       m.setValor(22);
       
        System.out.println(i.toString());
        System.out.println(v.toString());
        System.out.println(m.toString());
    }
    
}
