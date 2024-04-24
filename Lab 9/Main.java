class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a thread using the Thread class
        MyThread thread1 = new MyThread();

        // Starting the thread
        thread1.start();

        // Getting the name of the thread
        System.out.println("Thread name: " + thread1.getName());

        // Setting the name of the thread
        thread1.setName("MyThread1");

        // Getting the updated name of the thread
        System.out.println("Updated thread name: " + thread1.getName());

        // Getting the priority of the thread
        System.out.println("Thread priority: " + thread1.getPriority());

        // Setting the priority of the thread
        thread1.setPriority(Thread.MAX_PRIORITY);

        // Getting the updated priority of the thread
        System.out.println("Updated thread priority: " + thread1.getPriority());

        // Checking if the thread is alive
        System.out.println("Is thread alive? " + thread1.isAlive());

        try {
            // Pausing the main thread for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Checking if the thread is alive after 2 seconds
        System.out.println("Is thread alive? " + thread1.isAlive());
    }
}
