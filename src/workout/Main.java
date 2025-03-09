package workout;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int i = 0 , j = 0;
        ArrayList<Integer> nw = new ArrayList<>(Arrays.asList(1 ,2 ,5,0 , 34, 14));
        nw.sort(null);
        System.out.println(nw);
        nw.stream().max(null);
        int remain = 0;
        while(i < fruits.length){
            if(fruits[i] <= baskets[j]){
                baskets[j]=-1;
                i++;
                j=0;
            }else{
                j++;
            }if( j == baskets.length ){
                i++;
                j=0;
                remain++;
            }
        }
        return remain;
    }

    public static void main(String[] args) {
//        System.out.println(numOfUnplacedFruits(new int[]{4,2,5},new int[]{3,5,4}));
//        System.out.println(numOfUnplacedFruits(new int[]{3,6,1},new int[]{6,4,7}));
//        System.out.println(numOfUnplacedFruits(new int[]{7,4,10,5},new int[]{3,2,7,9}));
        System.out.println(leaders(new int[]{16, 17, 4, 3, 5, 2}));
    }
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = arr.length - 1;
        while( i >= 0 ){
            if(i == arr.length - 1) {
                ans.add(arr[arr.length-1]);
            }
            else if(arr[i+1] < arr[i]) ans.add(arr[i]);

            i--;

        }
        return ans;

    }
}
