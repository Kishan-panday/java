import java.util.Scanner;

public class count {
    public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int count = 0;
        while (n>0) {
            rem = n % 10;
            if (rem ==5) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }

}  
