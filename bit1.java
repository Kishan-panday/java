import java.util.Scanner;

public class bit1 {
    public static void main(String[] args) {
        int n= 5;
        int pos=3;
        int bitMask = pos>>1;
         //get Bit
        if((bitMask & n)==0){
            System.out.println("Bit is Zero");
        }else
         System.out.println("Bit is One");
        //set Bit
        int newNumber= bitMask | n;
        System.out.println(newNumber);
         //clear Bit
         int x=~bitMask;
         System.out.println(x&n);
            //update Bit
            //oper->1 :set   oper->0 :clear
            System.out.println("Enter the value in term 1 0r 0:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a==1){
                 
                System.out.println(newNumber);
            }else{
            
            System.out.println(x&n);
            }
         }
    }
    

