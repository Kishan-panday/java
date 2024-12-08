import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit){
            case "Mango":
            System.out.println("King of all fruit");
            break;
            case "Apple":
            System.out.println("All time in dimand");
            break;
            case "guava":
            System.out.println("green fruit");
            break;
            case "Papaya":
            System.out.println("Healty fruit");
            break;
            default:
            System.out.println("Not a type of fruit");
        }

    }
}
