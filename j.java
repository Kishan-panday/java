public class j {
    public static void main(String args[]) {
        String s1 = "Java";
        String s2 = new String(s1);
        String s3 = "Java";
        String s4 = "java";
        
        System.out.println((s1 == s2) + "" + (s1 == s3) + "" + (s1 == s4)   + "" + (s1.equalsIgnoreCase(s4)));
    }

    
}
