
package Biblioteca;


public class Livro {
    int cod;
    String nome;
    String autor;
    int genero;
    boolean disponivel;

    public Livro(int cod, String nome, String autor, int genero, boolean disponivel) {
        this.cod = cod;
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.disponivel=disponivel;
    }    
    
}
