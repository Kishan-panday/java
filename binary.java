public class binary {
    static int search(int element,int arr[]){
        int low =0;
        int high = arr.length-1;
        
       while (low<=high) {
        int mid =(low+high)/2;
        if(arr[mid]==element){ 
            return mid;
        }
        else if(arr[mid] < element){
            low = mid+1;
        }else
        high = mid-1;
       }
       return -1;
      
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,32,45,67,89,98,99};
       int ans = search(6,arr);
       System.out.println(ans);
        }
    }


