package Sorting.Selectionsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public int[] list = new int[10];

    private void selectionSort() {
        for (int i = 0; i < list.length; i++) {
            int minPos = i;
            int j;
            for (j = i + 1; j < list.length;
                 j++) {
                if(list[i] < list[minPos]) {
                    minPos = j;
                }
            }

            if (minPos != i) {
                list[minPos] = list[i];
                list[i] = minPos;
            };
        }
    }
}
