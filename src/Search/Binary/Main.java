package Search.Binary;

import Search.SetUp.Student;

import java.util.ArrayList;
import java.util.List;

public class Main { //Uses the Student class in the SetUp folder
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(List.of(new Student("Andrew", 22), new Student("August", 24), new Student("Brian", 25), new Student("Charles", 19), new Student("Daniel", 26),new Student("Eric", 22), new Student("Mike", 21)));

        String targetName = "Daniel";
        Student foundStudent = binarySearch(students, targetName);
        System.out.println(foundStudent);

        targetName = "August";
        foundStudent = binarySearch(students, targetName);
        System.out.println(foundStudent);

        String notInListName = "Henry";
        Student notInListStudent = binarySearch(students, notInListName);
        if (notInListStudent == null) {
            System.out.println("Henry not found");
        }
    }

    public static Student binarySearch(ArrayList<Student> list, String name) {
        int start = 0;
        int end = list.size();
        while(start <= end) {
            int middle = (end+start)/2;
            Student candidate = list.get(middle);
            if (candidate.getName().equals(name)) {
                return candidate;
            } else {
                if (candidate.getName().compareTo(name) > 0) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return null;
    }
}
