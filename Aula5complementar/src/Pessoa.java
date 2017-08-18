
public class Pessoa {
    String nome;
    String email;
    String senha;
    String nick;
    
    public String login(String nick,String senha){
      if(nick==this.nick && senha==this.senha){
          return "login confirmado";
      }else{
          return "senha invalida";
      }
    }
}
