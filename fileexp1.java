import java.io.*;
public class fileexp1 {
    public static void main(String[] args) {
        File r = new File("C:\\Users\\KIIT0001\\Desktop\\kishan.txt");
        try{
            if (r.createNewFile()) {
            System.out.println("File created.");
        } else {
            System.out.println("File already exists or an error occurred.");
        }
        if (r.exists()) {
            System.out.println("File name:"+r.getName());
            System.out.println("file location:"+r.getAbsolutePath()); 
            System.out.println("File writable:"+r.canWrite());
            System.out.println("File readable:"+r.canRead());
            System.out.println("File size:"+r.length());
        }
        
    }catch(IOException i){
        System.out.println(i);
    }


}
}