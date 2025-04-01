import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        
        String r= "";
        int l = name.length();
        for(int i =l-1;i>=0;i--){
           r +=name.charAt(i);
        }
          System.out.println(r);
        sc.close();
       
    }
}
