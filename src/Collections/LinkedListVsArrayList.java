package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {

    public static void main(String[] args) {


        List<Integer> arrList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int total = 1_000_000;
        long timeTakeArr = addElements(arrList,total);
        long timeTakeLlist = addElements(linkedList, total);
        System.out.println(timeTakeLlist +" "+timeTakeArr);
        if(timeTakeLlist > timeTakeArr) System.out.println("Arraylist is speed");
        else System.out.println("LinkedList is speed");
        System.out.println("Completed");

        //Conclusion : For searching and retriving Data ArrayList is best
        //For insertion and delection at a particular pos is easier and fast in LinkedList
    }

    public static long addElements(List<Integer> list , int end){
        long startTime = System.nanoTime();
        for(int i=0 ; i < end ; i++) list.add(0,i); // insertion at particular pos makes arrList slower
        return System.nanoTime() - startTime;
    }


//    public static long addElements(List<Integer> list , int end){
//        long startTime = System.nanoTime();
//        for(int i=0 ; i < end ; i++) list.add(i); //For insertion ArrayList is faster than LinkedList
//        return System.nanoTime() - startTime;
//    }




}
