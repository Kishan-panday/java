class A implements Runnable{
   public void run(){
    
      for(int i=1 ;i<5;i++){
         System.out.println("Thread1");
      }
    }
}


public class multithread {
    public static void main(String[] args)  {
        A r =new A();
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t2.start();
        t3.start();
        for(int i= 1;i<5;i++){
        System.out.println("Thread2");
        }
        
    }
}
