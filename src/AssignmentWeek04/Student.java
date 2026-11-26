package AssignmentWeek04;

public class Student {

    // Fields
    String name;
    int age;
    String grade;
    String major;

    // Constructor
    public Student(String name, int age, String grade, String major) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.major = major;
    }

    // Display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Major: " + major);
        System.out.println("-------------------------");
    }
}