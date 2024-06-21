package Recursion.SumOfArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myInts = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sum(myInts));
    }

    public static int sum(ArrayList<Integer> list) {
        return sum(list, 0);
    }

    private static int sum(ArrayList<Integer> list, int index) {
        int result;
        if (index == list.size()) {
            result = 0;
        } else {
            result = list.get(index) + sum(list, index + 1);
        }
        return result;
    }
}
