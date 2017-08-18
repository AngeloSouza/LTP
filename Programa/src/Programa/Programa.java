/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author Aluno
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Documento doc1 = new Documento();
        doc1.codigo=123456;
        doc1.nome="alfredo";
        doc1.foto="img1.jpg";
        doc1.dataNasc="07/02/1980";
        System.out.println("codigo: "+doc1.codigo);
        
    }
    
}
