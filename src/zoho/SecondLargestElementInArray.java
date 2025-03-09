package zoho;

public class SecondLargestElementInArray {
    public static int secondLargestElement(int[] arr){
        int max = -1 , secMax = -1;
        for(int i = 0 ; i < arr.length ; i++){
           if(arr[i] > max){
               secMax = max;
               max = arr[i];
           }else if( arr[i] > secMax){
               secMax = arr[i];
           }
        }
        return secMax;
    }
    public static void main(String[] args) {
        System.out.println(secondLargestElement(new int[]{2,1,3,6,4,7,7,3,0,6,3,12,5,45,67}));
    }
}
