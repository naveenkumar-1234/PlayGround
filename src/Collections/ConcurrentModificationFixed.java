package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationFixed {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("john");
        arrayList.add("mike");
        arrayList.add("peter");

        Iterator<String> it = arrayList.iterator();

        while(it.hasNext()){
            String name = it.next();
            if (name.startsWith("j") || name.startsWith("m")) {
                it.remove();
            }
        }
//        for (String name : arrayList) {
//            if (name.startsWith("j") || name.startsWith("m")) {
//                arrayList.remove("mike");
//            }
//        }
        System.out.println(arrayList);
        System.out.println("Completed");
    }
}
