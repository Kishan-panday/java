class A implements Runnable{
    public void run(){
        for(int i = 10; i>=1; i--){
            System.out.print(i+" ");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }
}

public class thread1 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(500);
        A r = new A();
        Thread t = new Thread(r);
        t.start();
    }
    
}
