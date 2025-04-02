class A extends Thread{
    public void run(){
        for(int i = 0; i<=50;i++){
            if( i%2==0){
                System.out.println(i+" " + "even no.");
            }
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
                System.out.println("InterruptedException");
            }
        } 
    }
}
public class thread3 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(50);
        A r = new A();
        r.start();
         for(int i = 0; i<=50;i++){
            if( i%2!=0){
                System.out.println(i+"  "+"Odd no.");}
            }
           

    }
    
}
