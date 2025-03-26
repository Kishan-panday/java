import java.util.Scanner;
public class java {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try{
    int d = sc.nextInt();
    int a = 10 /d;
    try{
        int c[]= {1,2,3,4};
        int x= c[d];
        System.out.println(x);
        int k = sc.nextInt();
        int r = 100/k;
    }

    catch(ArithmeticException e){
        System.out.println("inner try block");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("invalid index");
    }
 

}catch(ArithmeticException e){
    System.out.println("ArithmeticException outer block");
}finally{
    System.out.println("kisan");
}
    }}