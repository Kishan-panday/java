import java.util.Scanner;

class A extends Thread{
    int lowerRange,upperRange;
public A(String name, int lowerRange, int upperRange) {
    super(name); // Set thread name
    this.lowerRange = lowerRange;
    this.upperRange = upperRange;
}

    public void run(){

    //   String threadName  = Thread.currentThread().getName();
    //     System.out.println("Thread name: " + threadName );
    System.out.println("Thread - " + getName());
       for(int i=lowerRange;i<=upperRange;i++){
        System.out.print(i + " ");
       }
       try{
        Thread.sleep(5);
       }catch(InterruptedException e){
        System.out.println("sorry it is error");
       }
      
    }
}
class lab8_1{
    public static void main(String[] args) throws InterruptedException  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the thread: ");
        String threadName = sc.nextLine();
        System.out.print("Enter the lower range of counter: ");
        int lowerRange = sc.nextInt();
        
        System.out.print("Enter the upper range of counter: ");
        int upperRange = sc.nextInt();
        
        sc.close();
        A r = new A(threadName, lowerRange, upperRange);
        r.start();

}
}
// import java.util.Scanner;

// class CounterThread extends Thread {
//     private int lowerRange, upperRange;

//     public CounterThread(String name, int lowerRange, int upperRange) {
//         super(name); // Set thread name
//         this.lowerRange = lowerRange;
//         this.upperRange = upperRange;
//     }

//     @Override
//     public void run() {
//         System.out.println("Thread - " + getName());
//         for (int i = lowerRange; i <= upperRange; i++) {
//             System.out.print(i + " ");
//             try {
//                 Thread.sleep(5); // Pause for 5 milliseconds
//             } catch (InterruptedException e) {
//                 System.out.println("Thread interrupted");
//             }
//         }
//         System.out.println();
//     }
// }

// public class lab8_1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter the name of the thread: ");
//         String threadName = scanner.nextLine();
        
//         System.out.print("Enter the lower range of counter: ");
//         int lowerRange = scanner.nextInt();
        
//         System.out.print("Enter the upper range of counter: ");
//         int upperRange = scanner.nextInt();
        
//         scanner.close();

//         CounterThread counterThread = new CounterThread(threadName, lowerRange, upperRange);
//         counterThread.start();
//     }
// }
