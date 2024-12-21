package BasicRecursion;

import java.util.Arrays;

public class Recursion {
    static int sumOfFirstN_number(int n){
        if(n==1) return 1;
        return n + sumOfFirstN_number(n-1);
    }
    static void sumOfFirstN_number(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        sumOfFirstN_number(n-1,sum+n);
    }

    static int factorial(int num){
        if(num==1) return 1;
        return num * factorial(num-1);
    }
    static void swap(int[] arr,int i,int len){
        int temp=arr[i];
        arr[i]=arr[len-i-1];
        arr[len-i-1]=temp;
    }
    static void reverseArray(int[] arr,int i){
        int len=arr.length;
        if(i>=len/2) return;
        swap(arr,i,len);
        reverseArray(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr={6,3,6,3,4,6,79};
        reverseArray(arr,0);

    }
}
