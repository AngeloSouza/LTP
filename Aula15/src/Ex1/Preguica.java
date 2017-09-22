/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

/**
 *
 * @author Aluno
 */
public class Preguica extends Animal{
    
    public Preguica(){
        super();
    }
    
    @Override
    public  String emiteSom(){
       return "som de preguiça"; 
    }
    
    @Override
    public  String acao(){
        return"subir em arvore";
    }
}
