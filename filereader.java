import java.io.FileReader;
import java.io.IOException;

public class filereader {
    public static void main(String[] args) {
      
        try{
            FileReader r= new FileReader("C:\\Users\\KIIT0001\\Desktop\\kishan.txt");
        try{
            int i;
            while((i=r.read())!=-1){
                System.out.print((char)i);
            }
        }finally{
        
            System.out.println("  hii");
        }
    }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
