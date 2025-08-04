public class print1 {
   
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Reversed string: " + sb.toString());
    }
}

