package Sorting.Insertionsort;

public class Main {

    private int[] list = new int[10];

    private void insertionSort() {
        for (int i = 1; i < list.length; i++) {
            int next = list[i];
            int j = i;
            Boolean found = false;
            while (!found && j > 0) {
                if (next >= list[j - 1]) {
                    found = true;
                } else {
                    list[j] = list[j - 1];
                    j--;
                }
            }
            list[j] = next;
        }
    }
}
