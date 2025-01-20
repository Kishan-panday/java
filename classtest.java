class demo{
    double width;
    double height;
    double len;
}
public class classtest {
    public static void main(String[] args) {
    demo obj = new demo();
    obj.width= 5;
    obj.height= 2;
    obj.len = 6;
System.out.println("The area"+" " + obj.width*obj.height*obj.len);
}
}