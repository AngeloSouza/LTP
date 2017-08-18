
package Programa;

import java.util.Scanner;

public class Programa3 {

    public static void main(String[] args) {
        Documento documentos[] = new Documento[5];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < documentos.length; i++) {
            System.out.println("informe o codigo para a pessoa "+(i+1)+": ");
            documentos[i].codigo=in.nextInt();
            System.out.println("informe o nome para a pessoa "+(i+1)+": ");
            documentos[i].nome=in.nextLine();
            System.out.println("informe a data de nascimento para a pessoa "+(i+1)+": ");
            documentos[i].dataNasc=in.nextLine();
            System.out.println("informe o arquivo de foto para a pessoa "+(i+1)+": ");
            documentos[i].foto=in.nextLine();
            System.out.println("");
        } 
        for (Documento documento : documentos) {
            System.out.println("codigo : " + documento.codigo + " | nome: " + documento.nome + " | foto: " + documento.foto + " | data nasc: " + documento.dataNasc);
        }

    }
    
}
