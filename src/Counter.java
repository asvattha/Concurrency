public class Counter{

    private int c = 0;

    public synchronized void increment(){

        for (int i = 0; i < 100000; i++){
            c++;
        }
    }

    public synchronized void decrement(){
        for (int j = 0; j < 100000; j++){
            c--;
        }
    }

    public int value(){
        return c;
    }
    
}
