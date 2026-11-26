package AssignmentWeek04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList of Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add five student objects
        students.add(new Student("Alice", 26, "A", "Business"));
        students.add(new Student("Beatriz", 19, "C", "Cybersecurity"));
        students.add(new Student("Daniel", 20, "A", "Engineering"));
        students.add(new Student("Bruno", 27, "B", "Information of Technology"));
        students.add(new Student("Leticia", 23, "B", "Marketing"));

        // Display students who are 21 or older
        System.out.println("Students who are 21 years old or older:");

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).age >= 21) {
                students.get(i).displayInfo();
            }
        }
    }
}

