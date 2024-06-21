package Merge.Total;

import java.util.ArrayList;

public class Main {
    /**
     * Returnerer en sorteret ArrayList der indeholder alle
     * elementer fra både s1 og s2
     * Krav: s1 og s2 er sorterede og indeholder Integer
     */
    public static ArrayList<Integer> flet(ArrayList<Integer> s1, ArrayList<Integer> s2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int index1 = 0;
        int index2 = 0;
        // flet sålænge der er noget i begge lister
        while (index1 < s1.size() && index2 < s2.size()) {
            if (s1.get(index1) <= s2.get(index2)) {
                // s1's første tal er mindst
                result.add(s1.get(index1));
                index1++;
            } else { // s2's første tal er mindst result.add(s2.get(index2));
                index2++;
            }
        }
        // tøm den liste der ikke er tom
        while (index1 < s1.size()) {
            result.add(s1.get(index1));
            index1++;
        }
        while (index2 < s2.size()) {
            result.add(s2.get(index2));
            index2++;
        }
        return result;
    }
}
