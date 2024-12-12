package Collections;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //List
        List<Integer> arr = new ArrayList<>();
        List<Integer> lin = new LinkedList<>();
        List<Character> st = new Stack<>();
        List<Character> v = new Vector<>();

        //Set
        Set<Integer> hs = new HashSet<>();
        Set<String> linHs = new LinkedHashSet<>();

        //Queue
        Queue<Character> pq = new PriorityQueue<>();
        Deque<String> ll = new LinkedList<>();

        //Map
        Map<Character,Integer> mp = new HashMap<>();
        Map<String,Integer> ht = new Hashtable<>();
        //Map.Entry

        //Iterable
        Iterator it = arr.iterator();

        //Common methods in Collections Class
        Collections.sort(arr);
        Collections.shuffle(arr);
        Collections.sort(arr,Collections.reverseOrder());

    }
}
