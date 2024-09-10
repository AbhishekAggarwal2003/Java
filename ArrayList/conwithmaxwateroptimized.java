package ArrayList;

import java.util.ArrayList;

//Two Pointer Approach

public class conwithmaxwateroptimized {

    public static void storedWater(ArrayList<Integer> list, int lp, int rp) {
        int maxVol = Integer.MIN_VALUE;
        while (rp > lp) {
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;
            int vol = height * width;
            maxVol = Math.max(maxVol, vol);
            if (list.get(lp) < list.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        System.out.println(maxVol);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        int lp = 0;
        int rp = list.size() - 1;
        storedWater(list, lp, rp);
    }

}
