package Sorting;

import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            int min = i;
            for(int j = i + 1 ; j < arr.length ; j ++){
                if(arr[j] < arr[min])  min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void bubbleSort(int[] arr){
        for(int i = 0 ; i < arr.length-1 ; i ++){
            for(int j = 0 ; j <arr.length-1 ; j ++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void insertionSort(int[] arr){
        int n = arr.length ;
        for(int i = 1 ; i < n ; i ++){
                int key = arr[i];
                int j = i - 1 ;
                while( j >= 0 && arr[j] > key){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
        }
    }
    public static void mergeSort(int[] arr){
        if( arr.length < 2) return; //base
        int len = arr.length;
        int mid = len / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[len-mid];

        for(int i = 0 ; i < mid ; i++){
            leftHalf[i] = arr[i];
        }
        for(int i = mid ; i < len ; i++){
            rightHalf[i-mid] = arr[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(arr,leftHalf , rightHalf);
    }

    private static void merge(int[] arr, int[] leftHalf , int[] rigthHalf) {
       int leftSize = leftHalf.length;
       int rightSize = rigthHalf.length;

       int i = 0 , j = 0 , k = 0;

       while(i < leftSize && j < rightSize){
           if(leftHalf[i] < rigthHalf[j]){
               arr[k] = leftHalf[i];
               i++;
           }else{
               arr[k] = rigthHalf[j];
               j++;
           }
           k++;
       }
       while( i < leftSize ){
           arr[k] = leftHalf[i];
           i++;
           k++;
       }
       while(j < rightSize){
           arr[k] = rigthHalf[j];
           j++;
           k++;
       }
    }


    public static void main(String[] args) {
//        int[] arr = { 4, 1, 3, 9, 7};
//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));

        Random rand = new Random();
        int[] arr = new int[20];
        for(int i = 0 ; i < 20 ; i++ ){
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("-------------------------");
        System.out.println(Arrays.toString(arr));


    }
}
