package multi_threading;

// MyThread2 class implements Runnable interface
// This is the second method of thread creation in Java
// (Thread creation by implementing Runnable interface)
public class MyThread2 implements Runnable {

    // Overriding the run() method of Runnable interface
    // The code inside run() defines the task that the thread will perform
    @Override
    public void run() {

        // Loop runs 5 times
        for(int i = 1; i <= 5; i++) {

            try {

                // Pauses the current thread for 1000 milliseconds (1 second)
                Thread.sleep(1000);

                // Displays that the user-defined thread is running
                System.out.println("User Defined Thread");

                // Prints the iteration number
                System.out.println("MyThread2: " + i);

            }

            // Handles the InterruptedException thrown by sleep()
            catch (InterruptedException e) {

                // Prints the exception details if the thread is interrupted
                e.printStackTrace();
            }
        }
    }
}