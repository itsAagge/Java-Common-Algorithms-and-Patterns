package ChainedDataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> myStrings = new LinkedList<>();
        myStrings.add("Hello");
        myStrings.add("World");
        myStrings.add("Welcome");
        for (String myString : myStrings) {
            System.out.println(myString);
        }

        System.out.println();

        System.out.println(myStrings.getFirst());
        System.out.println(myStrings.get(1));

        System.out.println();

        System.out.println("Removing welcome: " + myStrings.remove("Welcome"));
        for (String myString : myStrings) {
            System.out.println(myString);
        }

        System.out.println();

        myStrings.clear();
        if (myStrings.isEmpty()) {
            System.out.println("Array is empty");
        }
    }
}
