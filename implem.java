class A implements Runnable{
    public void run(){
        for(int i= 1;i<6;i++){
           System.out.println("pandey");
           try{
            Thread.sleep(1000);

           }catch(InterruptedException e){
            System.out.println("cat");
           }
        }
    }
}
class implem   {
    public static void main(String[] args) throws InterruptedException{
    Thread.sleep(1000);
    A r = new A();
    Thread t = new Thread(r);
    t.start();
    for(int i =1; i<5;i++){
        System.out.println("at kiit");
    }
    }
}