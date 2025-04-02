class A extends Thread{
    public void run(){
        for(int i = 0; i<=5;i++){
           System.out.print(i+ " ");
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
                System.out.println("InterruptedException");
            }
        } 
    }
}
public class thread4 {
    public static void main(String[] args)  {
        
    
    A t1 = new A();
    A t2 = new A();
    A t3 = new A();
    t1.start();
    t2.start();
    t3.start();
}
}
