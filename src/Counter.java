public class Counter{

    private int c = 0;

    public void increment(){
        for (int i = 0; i < 100000; i++){
            c++;
        }
    }

    public void decrement(){
        for (int i = 0; i < 100000; i++){
            c--;
        }
    }

    public int value(){
        return c;
    }
    
}
