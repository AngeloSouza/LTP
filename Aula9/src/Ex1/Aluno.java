
package Ex1;

public class Aluno {
    private String nomeAlu, turma;
    private int matricula, idade;

    public Aluno() {
    }
    

    public String getNomeAlu() {
        return nomeAlu;
    }

    public String getTurma() {
        return turma;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setNomeAlu(String nomeAlu) {
        this.nomeAlu = nomeAlu;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void geraMat(String nomeAlu, int idade, int mat){
        this.matricula=mat;
        this.nomeAlu=nomeAlu;
        this.idade=idade;
        defTur();
        
    }
    public void defTur(){
        int aux=this.idade;
        
        if(aux<18){
            this.turma="Adolecente";
        }else if(aux<40){
            this.turma="Jovem";
        }else if(aux<60){
            this.turma="Adulto";
        }else{
            this.turma="Idoso";
        }
        
    }
}
