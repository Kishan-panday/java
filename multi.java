
class A extends Thread{
 public void run(){
    
    for(int i=0;i<=5;i++){
       System.out.println("kishan");}
    try{
        Thread.sleep(1000);}
    catch(InterruptedException e){
        System.out.println("exe");
    }
 
}
}
class multi{
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        A t =new A();
        t.start();
        for(int j =0;j<=5;j++){
            System.out.println("pandey");
        }
    }
}
