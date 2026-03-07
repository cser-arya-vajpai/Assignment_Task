package multi_threading;

public class JavaApp {

    public static void execution() {
        
        // Creating an object of MyThread1 class
        // This object represents a new thread
        MyThread1 myThread1 = new MyThread1();
        
        // Calling start() to begin thread execution
        // start() creates a new thread and internally calls the run() method
        // If we call run() directly, it will execute like a normal method
        // and no new thread will be created (no multi-threading)
        myThread1.start();
        
    }
}