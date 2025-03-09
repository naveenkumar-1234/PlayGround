package dailystrike;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
            Map<Integer , Integer> hashMap = new TreeMap<>();
            for( int i = 0 ; i < nums1.length ; i++){
                hashMap.put(nums1[i][0],hashMap.getOrDefault(nums1[i][0],0)+nums1[i][1]);
            }for( int i = 0 ; i < nums2.length ; i++){
                hashMap.put(nums2[i][0],hashMap.getOrDefault(nums2[i][0],0)+nums2[i][1]);
            }
            System.out.println(hashMap);
            int[][] ans = new int[hashMap.size()][2];
            int i = 0;
            for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
                ans[i][0] = entry.getKey();
                ans[i][1] = entry.getValue();
                i++;
            }
            return ans;
    }


    public static void main(String[] args) {
        int[][] num1 = {{1,2},{2,3},{4,5}};
        int[][] b = {{1,4},{3,2},{4,1}};
        int[][] z = {{2,4},{3,6},{5,5}};
        int[][] y = {{1,3},{4,3}};
//        System.out.println(Arrays.toString(new int[]{1, 2, 3}));
//        int[][] ans = mergeArrays(z,y);
        int[][] ans = mergeArrays(num1 , b);
        for( int[] n : ans){
            for( int a : n){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
