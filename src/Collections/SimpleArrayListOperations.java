package Collections;

import java.util.ArrayList;
import java.util.List;

public class SimpleArrayListOperations {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(10);
        list.add(43);
        list.add(3);
        list.add(32);
        list.add(50);
        System.out.println(list);

        //remove the element is index
        list.remove(0);

        //update element
        list.set(0,99);

        for(int num : list){
            System.out.println(num);
        }



    }
}
