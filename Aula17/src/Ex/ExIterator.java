
package Ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;




public class ExIterator {
    
    public static void main(String[] args) {
        ArrayList<Integer> minhaLista; 
        minhaLista = new ArrayList<>();
        minhaLista.add(2);
        minhaLista.add(1);
        minhaLista.stream().forEach((listaElementos) -> {
            System.out.println(listaElementos);
        });
        System.out.println("");
        
        Iterator iMinhaLista = minhaLista.iterator();

        do{
            System.out.println(iMinhaLista.next());
        }while(iMinhaLista.hasNext());
        
        
        
        LinkedList<String> nomes = new LinkedList<>();
               nomes.add("Eduardo");
               nomes.add("Luiz");
               nomes.add("Bruna");
               for (String nome : nomes) {
                      System.out.println(nome);
               }
               testando123(nomes);
        
    }
    public static void testando123(List teste){
        
    }
}
