package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapImp {

    public static void main(String[] args) {

        Student st = new Student();
        st.insertion("John", 87);
        st.insertion("Parker", 57);
        st.insertion("Leo", 94);

        st.getDetails();

        st.deletion("Leo");
        st.getDetails();

        st.updation("Parker",99);
        st.search("Leo");

        st.getDetails();


    }
}

class Student{
    private HashMap<String, Integer> hashMap = new HashMap<>();

    public void insertion(String name , int mark){
        hashMap.put(name,mark);
        System.out.println("Added successfully");
    }
    public void deletion(String name){
        if(hashMap.isEmpty() ){
            System.out.println("Empty");
            return;
        }
        hashMap.remove(name);
        System.out.println("Deleted successfully");
    }

    public void search(String name){
        if(hashMap.containsKey(name) ){
            System.out.println(hashMap.get(name));
            return;
        }
        else{
            System.out.println("Not available in Set");
            return;
        }

    }

    public void updation(String name,int mark){
        if(hashMap.isEmpty() ){
            System.out.println("Empty");
            return;
        }if(hashMap.get(name) == null){
            System.out.println("Not available in Set");
            return;
        }
        hashMap.replace(name,mark);
        System.out.println("Updated successfully");

    }
    public void getDetails(){
        for(Map.Entry m : hashMap.entrySet()){
            System.out.println(m.getKey()+"--"+m.getValue());
        }
    }
}
