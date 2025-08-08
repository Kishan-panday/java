public class Linearse {

     public static int search(int target,int arr[]){
        if(arr.length==0) return -1;
        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,3,4,5};
        int a= 4;
      int ans=  search(a,num);
      System.out.println(ans);
    }
}