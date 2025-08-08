public class Linearse {

     public static int search(int target,int arr[]){
        if(arr.length==0) return -1;
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        int target= 4;
      int ans=  search(target,arr);
      System.out.println(ans);
    }
}