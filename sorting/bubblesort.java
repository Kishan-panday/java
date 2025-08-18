package sorting;
   import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        int arr[] = {8,7,6,9,45,3,267,566};
System.out.println(Arrays.toString(sort(arr)));

    }
    static int[] sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp; 
                }
            }
        }
    
        return arr;
    }
}

    

