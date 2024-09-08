package ArrayList;

import java.util.*;

public class creation {
    public static void main(String[] args) {
        // Classname Objectname = new classname
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list); // [1, 2, 3, 4]

        list.add(5);
        System.out.println(list); // [1, 2, 3, 4, 5]

        list.add(1, 9); // [1, 9, 2, 3, 4, 5]
        System.out.println(list);

        // Get o(1)
        System.out.println(list.get(2)); // 2

        // Delete O(n)

        list.remove(2); // [1, 9, 3, 4, 5]
        System.out.println(list);

        // Set O(n)
        list.set(2, 10); // [1, 9, 10, 4, 5]
        System.out.println(list);

        // contains -- exist
        System.out.println(list.contains(1)); // true
        System.out.println(list.contains(11)); // false

        System.out.println(list.size()); // 5

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // 1 9 10 4 5
        }
        System.out.println();

    }
}
