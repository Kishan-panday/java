import java.util.Scanner;

public class palindrom {
   public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int sum=0,r=0;
int temp = num;
while(num>0){
r=num%10;
sum =sum*10+r;
num = num/10;}

if(sum== temp){
System.out.println("palindrom");}
else{
System.out.println(" Not palindrom");}
}
}
