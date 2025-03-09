package BasicRecursion;

import java.util.Arrays;

public class Recursion {
    static int sumOfFirstN_number(int n){
        if(n==1) return 1;
        return n + sumOfFirstN_number(n-1); //decrementing the numbers , if the satisfy the base condition which is n==1 return;
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
        return num * factorial(num-1);      //if n=5 it performs 5*4*3*2*1
    }
    static void swap(int[] arr,int i,int len){   // it performs normal swapping by using one temp variable
        int temp=arr[i];
        arr[i]=arr[len-i-1];
        arr[len-i-1]=temp;
    }
    static void reverseArray(int[] arr,int i){
        int len=arr.length;
        if(i>=len/2) return;
        swap(arr,i,len);      // passing array ref , pointer i and length to swap
        reverseArray(arr,i+1);
    }
    static boolean compare(String str,int i){
        int len=str.length();     // we find length to reduce another pointer
        if(str.charAt(i)==str.charAt(len-i-1)) return true;  //we're using len-i-1 instead of another pointer variable. Eg:j=len-1; j--; in every iteration
        return false;
    }
    static boolean isPalindrome(String str,int i){
                if(i >= (str.length()-1)/2) return true;
        if(compare(str,i)) return compare(str,i+1);      // if it fails then it couldn't be Palindrome
        return false;
           }
    static int fibonacci(int n){
                if(n==0) return 0;
                if(n==1) return 1;
                return fibonacci(n-1) + fibonacci(n-2);   // its take O(2pow(n)) as Time complexity. It exponential growth because of 2 func calls
           }
    public static void main(String[] args) {
        int[] arr={6,3,6,3,4,6,79};
        reverseArray(arr,0);
        System.out.println(isPalindrome("1211",0));
        System.out.println(fibonacci(0));
    }
}
