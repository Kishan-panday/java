public class unique {
    public static void main(String[] args) {
        int ans=0;
        int[] arr= {2,3,4,5,2,3,4};
        for(int i=0;i<=6;i++){
            ans ^= arr[i];
        }
       System.out.println(ans);
    }
    
}
