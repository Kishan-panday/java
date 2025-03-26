import java.io.*;

public class WordCounter {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string: ");
            String input = reader.readLine();
            int wordCount = countWords(input);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            writer.write("Number of words: " + wordCount);
            writer.newLine();
            writer.flush();
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}