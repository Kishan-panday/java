class B implements Runnable{
    @Override
    public void run() {
        for(int i = 1;i<=10;i++){
            if(i%2==0){
                System.out.println(i +" "+"even no");
            }else{
                System.out.println(i +" "+"odd number");
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
       
    }


public class newthread {

public static void main(String[] args)throws InterruptedException {
    B n = new B();
   Thread r = new Thread(n);
    r.start();
}
    
}
