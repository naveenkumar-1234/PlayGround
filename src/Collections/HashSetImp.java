package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetImp {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();

        String str = "Peter parker";
        String name = new String("Peter parker");

        hashSet.add(str);
        hashSet.add(name);
        System.out.println(hashSet);
        ArrayList<String> arrayList = new ArrayList<>(hashSet.stream().toList());
        System.out.println(arrayList);


    }
}
