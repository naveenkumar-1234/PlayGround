package zoho;

import java.util.Arrays;

public class PushZeroToRight {
    public static void pushZeroToRight(int[] arr){
        int i = 0 , j = arr.length-1;
        while( i < j){
            if(arr[i] == 0 && arr[j] != 0){
                arr[i] = arr[j];
                arr[j] = 0;
            }
            else if(arr[i] == 0 && arr[j]==0) j--;
            else i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,0,4,0,9,1,0};
        pushZeroToRight(arr);
        System.out.println(Arrays.toString(arr));
    }
}
