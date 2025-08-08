public class linearsea {
    static int found(String str,char ch, int start,int end){
        if(str.length()==0) return -1;
        for(int i=start;i<end;i++){
            if(ch==str.charAt(i)) return i;
        }
        return -1;

    }
    public static void main(String[] args) {
        String name = "pandey";
        char c = 'n';
        System.out.println(found(name, c, 2, 4));
    }
}
