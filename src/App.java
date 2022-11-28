public class App{

    public static void main(String[] args) throws InterruptedException {
        
        Counter counter = new Counter();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                counter.increment();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run(){
                counter.decrement();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.printf("The result is %d", counter.value());
    }


}
