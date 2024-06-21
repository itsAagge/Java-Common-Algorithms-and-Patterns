package Search.Linear;

import Search.SetUp.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) { //Uses the Student class in the SetUp folder
        ArrayList<Student> students = new ArrayList<>(List.of(new Student("Andrew", 22), new Student("August", 24), new Student("Brian", 25), new Student("Charles", 19), new Student("Daniel", 26),new Student("Eric", 22), new Student("Mike", 21)));

        String targetName = "Daniel";
        Student foundStudent = linearSearch(students, targetName);
        System.out.println(foundStudent);

        targetName = "August";
        foundStudent = linearSearch(students, targetName);
        System.out.println(foundStudent);

        String notInListName = "Henry";
        Student notInListStudent = linearSearch(students, notInListName);
        if (notInListStudent == null) {
            System.out.println("Henry not found");
        }
    }

    public static Student linearSearch(ArrayList<Student> list, String name) {
        for (Student student : list) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }
}
