package implementations;

import java.util.ArrayList;

public class SnakePattern {


    static void ascending(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){

        }
    }
    static void decending(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){

        }

    }
    static void sortArray(int[] arr){

    }
    static ArrayList<Integer> snakePattern(int matrix[][]){
        boolean flag = true;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < matrix.length ; i++){
            sortArray(matrix[i]);
            if(flag){
                ascending(matrix[i]);
                flag = !flag;
            }else{
                decending(matrix[i]);
                flag = !flag;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[][] matrix = {{45, 48, 54}, {21, 89, 87}, {70, 78, 15}};
        System.out.println(snakePattern(matrix));
    }
}
