package ArrayList;

import java.util.ArrayList;

//Two Pointer Approach

public class pairSumOptimized {

    public static boolean pair(ArrayList<Integer> list, int target, int lptr, int rptr) {
        while (lptr != rptr) {
            if (list.get(lptr) + list.get(rptr) == target) {
                return true;
            } else if (list.get(lptr) + list.get(rptr) < target) {
                lptr++;
            } else {
                rptr--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 3;
        System.out.println(pair(list, target, 0, list.size() - 1));
    }
}
