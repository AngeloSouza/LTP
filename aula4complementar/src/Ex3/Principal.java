/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

public class Principal {

    public static void main(String[] args) {
        int[] num = new int[5];
        num = Fun.dados(num);
        System.out.println("\nO maior numero digitado foi " + Fun.retMai(num));
        System.out.println("\nO menor numero digitado foi " + Fun.retMen(num));
    }
}
