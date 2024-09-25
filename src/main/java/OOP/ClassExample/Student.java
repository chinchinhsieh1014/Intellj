package OOP.ClassExample;

public class Student {
    // instance fields
    String name;
    int id;

    // static fields
    static int totalStudents = 0;

    // constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        totalStudents++;
    }

    // instance methods
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student id: " + id);
        System.out.println("-".repeat(10));
    }
    // static methods
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}
