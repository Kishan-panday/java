import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int temp = 0;
        while (n>0) {
            rem = n % 10;
            n = n / 10;
            temp = temp *10 + rem;
           
            
        }
        System.out.println(temp);
    }
}
