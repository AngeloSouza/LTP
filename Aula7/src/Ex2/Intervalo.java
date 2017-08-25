package Ex2;

public class Intervalo {

    int first;
    int second;

    public Intervalo(int first, int second) {
        if (first < second) {
            this.first = first;
            this.second = second;
        } else {
            this.first = second;
            this.second = first;
        }
    }

    public void printImp() {
        
        for (int i = this.first; i < this.second; i++) {        
            if(i==2){
                System.out.println(i);
            }
        }
    }

}
