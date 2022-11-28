public class App implements Runnable{

    static boolean isInterrupted = false;
    static Object myLock = new Object();

    @Override
    public void run() {
        foo();
    }

    public static void foo() {
        for (int i = 0; i < 10; i++){
            try{
                if (isInterrupted){
                    System.out.println("Thread stopped");
                    return;
                }
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("I am not finished yet!!");
                return;
            }
            
            System.out.printf("%s %s%n", "*", Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) throws Exception {
        
        Thread t = new Thread(new App());
        t.setName("Thread 1");
        t.start();
        t.join(5000);
        //t.interrupt(); // interrupting it forcefully
        isInterrupted = true;

        System.out.printf("%s is finished%n", Thread.currentThread().getName());
    }


}
