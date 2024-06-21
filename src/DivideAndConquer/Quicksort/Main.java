package DivideAndConquer.Quicksort;

import java.util.ArrayList;

public class Main {

    public class QuickSort {
        private void swap(ArrayList<Integer> list, int k, int l) {
            Integer e = list.get(k);
            list.set(k, list.get(l));
            list.set(l, e);
        }

        private void quicksort(ArrayList<Integer> list, int low, int high) {
            if (low < high) {
                int p = partition(list, low, high);
                quicksort(list, low, p - 1);
                quicksort(list, p + 1, high);
            }
        }

        private int partition(ArrayList<Integer> list, int low, int high) {
            int e = list.get(low);
            int i = low + 1;
            int j = high;
            while (i <= j) {
                if (list.get(i) <= e) {
                    i++;
                } else if (list.get(j) > e) {
                    j--;
                } else {
                    swap(list, i, j);
                    i++;
                    j--;
                }
            }
            swap(list, low, j);
            return j;
        }

        public void quicksort(ArrayList<Integer> list) {
            quicksort(list, 0, list.size() - 1);
        }
    }

}
