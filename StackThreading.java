import java.util.Stack;

class StackTransfer {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();
    private Stack<Integer> s3 = new Stack<>();
    
    public StackTransfer(int[] elements) {
        for (int elem : elements) {
            s1.push(elem);
        }
    }
    
    public void task1() {
        try {
            while (!s1.isEmpty()) {
                int value = s1.pop();
                System.out.println("Task 1: Popped " + value + " from S1");
                Thread.sleep(200);
                s2.push(value);
                System.out.println("Task 1: Pushed " + value + " to S2");
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Task 1 Interrupted");
        }
    }
    
    public void task2() {
        try {
            while (!s2.isEmpty()) {
                int value = s2.pop();
                System.out.println("Task 2: Popped " + value + " from S2");
                Thread.sleep(500);
                s3.push(value);
                System.out.println("Task 2: Pushed " + value + " to S3");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Task 2 Interrupted");
        }
    }
    
    public void displayStack() {
        System.out.println("Final content of S3: " + s3);
    }
}

public class StackThreading {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5}; // Sample data
        StackTransfer stackTransfer = new StackTransfer(elements);

        Thread thread1 = new Thread(stackTransfer::task1);
        Thread thread2 = new Thread(stackTransfer::task2);
        
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        stackTransfer.displayStack();
    }
}