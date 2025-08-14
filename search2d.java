
import java.util.Arrays;
public class search2d {
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}

        };
        System.out.println(Arrays.toString(search(arr, 15)));
        
    }
    static int[] search(int[][] arr ,int target){
        int r=0;
        int c = arr.length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[] {r,c};
            }
            if(arr[r][c]>target)
            c--;
            else
            r++;
        }
        return new int[] {-1,-1};
    }
}
