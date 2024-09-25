package OOP.ClassExample;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("A", 1);
        Student student2 = new Student("B", 2);

        student1.displayInfo();
        student2.displayInfo();
        Student.displayTotalStudents();
    }
}
