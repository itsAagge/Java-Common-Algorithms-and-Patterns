package Sorting.Bubblesort;

import static java.util.Collections.swap;

public class Main {
    private int[] list = new int[10];

    private static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    private void bubblesort() {
        for (int i = list.length - 1; i >= 0; i--) {
            int j;
            for (j = 0; j <= i - 1; j++);
            {
                if (list[j] > list[j + 1]) {
                   swap(list, i, j);
                }
            }
        }
    }
}
