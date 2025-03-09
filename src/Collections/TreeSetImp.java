package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImp {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new HashSet<>();

        for(int i = 10 ; i >=-10 ; i--){
            treeSet.add(i);
            linkedHashSet.add(i);
        }
//        treeSet.add(null);
        linkedHashSet.add(null);

        System.out.println(treeSet);
        System.out.println(linkedHashSet);
    }
}
