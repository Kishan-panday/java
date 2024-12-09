import java.util.Scanner;

public class opposite_half_piramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=n; i>0;i-- ){
            for(int j=1;j<=i;j++){
               System.out.print(" * ");
            }
            System.out.println();
        }

    }
}

