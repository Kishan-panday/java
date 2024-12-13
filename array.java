public class array {
    public static void main(String[] args) {
        int ages[] = {45,23,65,78,98,42,87};
        int length = ages.length;
        int lowestage = ages[0];
        for(int age:ages){
            if(lowestage>age){
                lowestage = age;
            }
        }
        System.out.println(lowestage);

    }
}
