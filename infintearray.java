public class infintearray {
    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while (target>arr[end]) {
            int temp = end +1;
          end = end + (end - start +1)*2;
          start = temp;
        }
        return search(arr,target,start,end);

    }
    static int search(int[] arr,int target,int start,int end){
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid - 1;
            }else if(arr[mid]<target){
                start = mid +1;
            }else {
                return mid;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,23,45,56,67,77,78,89,99};
        int target = 45;
        System.out.println(ans(arr,target));
    }
}
