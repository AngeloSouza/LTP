
package Ex4;

public class Func {

    public int media(int num[]){
        int resp=0;
        for (int i = 0; i < num.length; i++) {
            resp+=i;
        }
        resp=resp/num.length;
        return resp;
    }
    
    public int maimen(int num[],int x){
        int aux;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-1; j++) {
                if (num[j] > num[j + 1]) {
                    aux = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = aux;
                }
            }
        }
        if(x==0){
          return num[0];  
        }else{
          return num[num.length-1];
        }
        
    }
}
