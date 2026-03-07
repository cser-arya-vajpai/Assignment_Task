package multi_threading;

// MyThread1 class extends Thread class to create a new thread
// This demonstrates multi-threading using inheritance
public class MyThread1 extends Thread { // Multilevel Inheritance

    // Overriding the run() method of Thread class
    // The code inside run() is executed when the thread starts
    @Override
    public void run() {
        
        // Loop runs 5 times
        for(int i = 1; i <= 5; i++) {
            try {
                
                // Pauses the execution of the current thread for 1000 milliseconds (1 second)
                Thread.sleep(1000);
                
                // Prints the current iteration number along with thread name
                System.out.println("MyThread1: " + i);
            }
            
            // Handles the InterruptedException thrown by sleep()
            catch (InterruptedException e) {
                
                // Prints the exception details if the thread is interrupted
                e.printStackTrace();
            }
        }
    }   	
}