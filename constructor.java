class a{
    int b;
    int c;
    a(int x,int y){
        b=x;
        c=y;
    
    }
    void show(){
       System.out.println(b+" "+c);

    }
}
    public class constructor{
        public static void main(String[] args) {
            a ref = new a( 4,5);
            ref.show();
        }
    }
