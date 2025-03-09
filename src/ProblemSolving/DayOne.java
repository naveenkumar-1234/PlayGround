package ProblemSolving;

import java.util.Arrays;
import java.util.HashMap;

public class DayOne {
    public static String reverseString(String str){
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString();
    }
    public static int secondLargest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 2];

    }
    public static int reverseInt(int num){
        int temp = 0;
        while(num > 0){
            temp *= 10 ;
            temp += num%10;
            num = num/10;
        }
        return temp;
    }
    public static boolean palindrome(int num){
        return reverseInt(num) == num;
    }
    public static HashMap<Character,Integer> frequencyCount(String str){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char ch : str.toCharArray()){
            hashMap.put(ch , hashMap.getOrDefault(ch,0)+1);
        }
        return hashMap;
    }
    public static int missingInArr(int[] arr){
        int sum = 0;
        int n = arr.length+1;
        for(int a : arr) sum+=a;
        return ((n * (n+1))/2) - sum;
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseString(str));
        int[] arr = {10,5,10,8};
        System.out.println(secondLargest(arr));
        int num = 5445;
        System.out.println(palindrome(num));
        System.out.println(frequencyCount(str));
        int[] array = {1,2,4,5,6,3,8};
        System.out.println(missingInArr(array));
    }
}
