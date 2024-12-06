import java.util.Scanner;

public class four {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
             case 1:System.out.println("hello");
             break;
             case 2:System.out.println("hii");
             break;
             default:System.out.println("bye");
        }


    }
}