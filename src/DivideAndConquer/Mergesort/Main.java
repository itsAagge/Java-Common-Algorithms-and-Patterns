package DivideAndConquer.Mergesort;

import java.util.ArrayList;

public class Main {


    private static void mergesort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m);
            mergesort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }

    // kombiner er realiseret ved fletteskabelonen
    private static void merge(ArrayList<Integer> list, int low, int middle, int high) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<>( list.subList(low, middle + 1));
        ArrayList<Integer> list2 = new ArrayList<>(list.subList(middle + 1, high + 1));

        int i1 = 0;
        int i2 = 0;

        while (i1 < list1.size() && i2 < list2.size()) {
            if (list1.get(i1) <= list2.get(i2)) {
                temp.add(list1.get(i1));
                i1++;
            }
            else {
                temp.add(list2.get(i2));
                i2++;
            }
        }

        while (i1 < list1.size()) {
            temp.add(list1.get(i1));
            i1++;
        }

        while (i2 < list2.size()) {
            temp.add(list2.get(i2));
            i2++;
        }


        for (int i = 0; i < temp.size(); i++) {
            list.set(low + i, temp.get(i));
        }

    }


}
