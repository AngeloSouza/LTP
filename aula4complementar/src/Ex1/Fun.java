
package Ex1;

public class Fun {
   public static float medArit(float[] x){
       float resp=1;
       for (int i = 0; i < x.length; i++) {
           resp*=x[i];
       }
       return resp/x.length;
   } 
   
   public static double medPond(float[] x){
        double resp=(x[0]*0.5)+(x[1]*0.3)+(x[2]*0.2);
        return resp;
   } 
}
