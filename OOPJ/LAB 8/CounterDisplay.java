import java.util.*;

class CounterThread extends Thread {
    private String threadName;
    private int lowerRange;
    private int upperRange;

    public CounterThread(String name, int lower, int upper) {
        this.threadName = name;
        this.lowerRange = lower;
        this.upperRange = upper;
    }
    
    public void run() {
        System.out.println("Thread - " + threadName);
        for (int i = lowerRange; i <= upperRange; i++) {
            try {
                Thread.sleep(5); // 5 milliseconds delay
                System.out.println("Counter - " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class CounterDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user sc for thread name, lower range, and upper range
        System.out.print("Enter the name of the thread: ");
        String threadName = sc.next();
        System.out.print("Enter the lower range of the counter: ");
        int lowerRange = sc.nextInt();
        System.out.print("Enter the upper range of the counter: ");
        int upperRange = sc.nextInt();

        // Create and start the custom thread for counter display
        CounterThread customThread = new CounterThread(threadName, lowerRange, upperRange);
        customThread.start();

    }
}
