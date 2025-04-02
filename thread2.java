import java.util.Scanner;

class A extends Thread{
    String name;
    int upperbound;
    int lowerbound;
    
     public A(String n, int t1,int t2){
        this.setName(n);
        this.upperbound = t1;
        this.lowerbound = t2;
     
    }
public void run(){
    
 for(int i = upperbound; i>=lowerbound;i--){
    System.out.println(getName()+"counter:"+ i + " ");
    try{
        Thread.sleep(500);
    }catch(InterruptedException e){
        System.out.println("InterruptedException");
    }
   }
 }
}


public class thread2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the name");
         String name = sc.nextLine();
        System.out.println("Enter the upperbound");
         int upperbound = sc.nextInt();
         System.out.println("Enter the lowerbound");
         int lowerbound = sc.nextInt();
         Thread.sleep(500);
        A r = new A(name,upperbound, lowerbound);
        r.start();

    }
}
