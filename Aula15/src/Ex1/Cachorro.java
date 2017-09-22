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
public class Cachorro extends Animal{
    
    public Cachorro(){
        super();
    }
    
    @Override
    public  String emiteSom(){
       return "latir"; 
    }
    
    @Override
    public  String acao(){
        return"corre";
    }
    
}
