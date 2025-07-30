public class string_2 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.print("Vowels in the string: ");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isVowel(c)) {
                System.out.print(c + " ");
            }
        }
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }
}
