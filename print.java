import java.util.Scanner;
import java.util.Arrays;
public class print{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[]= new String[5];
        for(int i=0;i<arr.length; i++){
            arr[i]= sc.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}
