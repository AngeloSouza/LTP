package Biblioteca;

public class Fun {

    String nick = "admin";
    String senha = "admin";

    public boolean login(String nick, String senha) {
        
        if ((this.nick == null ? nick == null : this.nick.equals(nick)) 
                && (this.senha == null ? senha == null : this.senha.equals(senha))) {
            System.out.println("login confirmado");
            return true;
        } else {
            System.out.println("usuario ou senha invalidos");
            return false;
        }

    }
    
    public void menu(){
        System.out.println("\n1 - Buscar livro \n2 – Cadastrar livro "
                + "\n3 – Emprestar \n4 – Devolver \n5 – Sair do sistema");
    }
}
