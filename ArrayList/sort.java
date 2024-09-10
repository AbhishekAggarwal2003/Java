package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(10);
        list.add(3);
        list.add(9);
        System.out.println(list);
        Collections.sort(list); // ascending
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // descending
        System.out.println(list);
    }
}
