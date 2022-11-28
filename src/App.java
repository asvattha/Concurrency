public class App implements Runnable{


    @Override
    public void run() {
        foo();
    }

    public static void foo() {
        for (int i = 0; i < 10; i++){
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {

            }
            
            System.out.printf("%s %s%n", "*", Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) throws Exception {
        
        Thread t = new Thread(new App());
        t.setName("Thread 1");
        t.start();

        System.out.printf("%s is finished%n", Thread.currentThread().getName());
    }


}
