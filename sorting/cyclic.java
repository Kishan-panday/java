package sorting;

import java.util.Arrays;
public class cyclic {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int arr[]){
        int i = 0;
        while(i<arr.length){
            int check = arr[i]-1;
            if(arr[i]!= arr[check]){
                int temp = arr[i];
                arr[i]= arr[check];
                arr[check] = temp;
            }else{
                i++;
            }
        }
        return arr;
    }
}
