package multi_threading;

// JavaApp class used to execute and start multiple threads
public class JavaApp {

    public static void execution() {
        
        // Creating an object of MyThread1 class
        // MyThread1 extends the Thread class
        // So this thread is created using the "Thread Class Inheritance" method
        MyThread1 myThread1 = new MyThread1();
        
        // Calling start() to begin execution of the thread
        // start() creates a new thread and internally calls the run() method
        // If run() were called directly, it would behave like a normal method
        // and no new thread would be created (no multithreading)
        myThread1.start();
        
        
        // Creating an object of MyThread2 class
        // MyThread2 implements the Runnable interface
        MyThread2 myThread2 = new MyThread2();
        
        // Creating a Thread object and passing the Runnable object to it
        // This is required because Runnable cannot start a thread by itself
        Thread thread = new Thread(myThread2);
        
        // Starting the thread which executes the run() method defined in MyThread2
        thread.start();
    }
}
