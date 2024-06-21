package Sorting.Bubblesort;

public class Main {
    public static void main(String[] args) {
        int[] myInts = {5, 3, 7, 8, 1, 2, 10, 4, 7};
        bubbleSort(myInts);
        for (int i = 0; i < myInts.length; i++) {
            System.out.print(myInts[i]);
            if (i + 1 < myInts.length) {
                System.out.print(", ");
            }
        }
    }
    private static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    public static void bubbleSort(int[] list) {
        for(int i = list.length - 1; i >= 0; --i) {
            for(int j = 0; j <= i - 1; ++j) {
                if (list[j] > list[j + 1]) {
                    swap(list, j, j + 1);
                }
            }
        }
    }
}
