package stringProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DayOne {

    public String reverseString(String str){
        StringBuilder strBuilder = new StringBuilder();
        for( int i = str.length()-1 ; i>=0 ; i--){
            strBuilder.append(str.charAt(i));
        }
        return strBuilder.toString();
    }

    //optimized approach for reverseString
    public String optReverseString(String str){
       char[] strArray = str.toCharArray();
       int left = 0 , right = str.length()-1;
       while(left < right){
           char temp = strArray[left];
           strArray[left] = strArray[right];
           strArray[right] = temp;
           left++;
           right--;
       }
       return new String(strArray);
    }
    public boolean isPalindrome(String str){
        int left = 0 , right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
//    public String nonRepeatingChar(String str){
//        Set<Character> hastSet = new HashSet<>();
//        StringBuilder ans = new StringBuilder();
//        for(char ch : str.toCharArray()){
//            if(!hastSet.isEmpty()){
//                if(!hastSet.contains(ch)){
//
//                }
//            }else hastSet.add(ch);
//        }
////        System.out.println(hashMap);
////        for(Map.Entry map : hashMap.entrySet()){
////            if(map.getValue().equals(0)) ans.append(map.getKey());
////        }
////        if(ans.isEmpty()) return "_";
////        else return ans.toString();
//    }
}
