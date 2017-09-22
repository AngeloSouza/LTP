
package Ex2;


public class NovoMain {

    
    public static void main(String[] args) {
       Funcionario empresa[] ;
       empresa=new Funcionario[3];//trocar para 10
       
       Basico b=new Basico(); b.setCod(002); b.setNome("juao"); b.setEscola("escola da vida");
       
       Medio m=new Medio(); m.setCod(003); m.setNome("ze"); m.setEscola("na marra"); m.setCategoria("normal");
       
       Graduado g=new Graduado(); g.setCod(004); g.setNome("joana"); g.setEscola("por ai"); g.setCurso("ads"); g.setModalidade("tecnologo");
       
       empresa[0]=b;
       empresa[1]=m;
       empresa[2]=g;
       
       double salariototal=0;
        for (Funcionario empresa1 : empresa) {
            salariototal += empresa1.getSalario();
        }
        System.out.println("o gasto total é: "+salariototal);
    }
    
}
