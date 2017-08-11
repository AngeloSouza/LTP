
package Ex3;


public class FuncEx3 {
    public static int rotina (int x,int y,int z){
        int resp=0;
        for (int i = y; i <=z ; i++) {
            if(i%x==0){
                resp+=i;
            }
        }
        return resp;
    }
}
