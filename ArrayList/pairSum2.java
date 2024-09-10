package ArrayList;

import java.util.ArrayList;

public class pairSum2 {

    public static int pivot(ArrayList<Integer> list) {
        int i = -1;
        while (i < list.size() - 1) {
            if (list.get(i) < list.get(i + 1)) {
                i++;
            } else {
                return i;
            }
        }
        return 0;
    }

    public static boolean pair(ArrayList<Integer> list, int target) {
        int pivot = pivot(list);
        int n = list.size();
        int lptr = pivot + 1;
        int rptr = pivot;
        while (lptr != rptr) {
            if (list.get(lptr) + list.get(rptr) == target) {
                return true;
            } else if (list.get(lptr) + list.get(rptr) < target) {
                lptr = (lptr + 1) % n;
            } else {
                rptr = (n + rptr - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        // System.out.println(pivot(list));
        System.out.println(pair(list, 30));
    }
}
