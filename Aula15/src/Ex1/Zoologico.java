
package Ex1;


public class Zoologico {

    public static void main(String[] args) {
       Animal zoologico[] ;
       zoologico=new Animal[3];//trocar para 10
       Veterinario v=new Veterinario();
       
       Cachorro ch=new Cachorro(); ch.setNome("cachorro"); ch.setIdade(2); 
       
       Cavalo cv=new Cavalo(); cv.setNome("cavalo"); cv.setIdade(2); 
       
       Preguica p=new Preguica(); p.setNome("preguiça"); p.setIdade(2);
       
       zoologico[0]=ch;
       zoologico[1]=cv;
       zoologico[2]=p;
       
        for (Animal zoologico1 : zoologico) {
            System.out.println(v.examinar(zoologico1));
            if (zoologico1.acao().equals("corre")) {
                System.out.println(zoologico1.getNome() + " " + zoologico1.acao());
            }
        }
       
      
      
    }
    
}
