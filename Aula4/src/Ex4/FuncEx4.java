/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4;

/**
 *
 * @author Aluno
 */
public class FuncEx4 {

    public static String retor(int x) {
        
        int s = x % 60;
        int m = x / 60;
        m = m % 60;
        int h = m / 60;
        
        String hms;
        hms=("hora: "+h+":"+m+":"+s+"");
        return hms;     
    }
}
