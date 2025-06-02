import java.util.HashMap;
import java.util.Map;

public class StudentManagementSystem {
    private Map<String, Student> studentMap;

    public StudentManagementSystem() {
        studentMap = new HashMap<>();
    }

    public void addStudent(String id, String name, int age) {
        Student student = new Student(id, name, age);
        studentMap.put(id, student);
        System.out.println("Student added: " + student);
    }

    public void removeStudent(String id) {
        if (studentMap.containsKey(id)) {
            Student removedStudent = studentMap.remove(id);
            System.out.println("Student removed: " + removedStudent);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void displayStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            System.out.println("Students in the system:");
            for (Student student : studentMap.values()) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.addStudent("1", "Alice", 20);
        sms.addStudent("2", "Bob", 22);
        sms.displayStudents();
        sms.removeStudent("1");
        sms.displayStudents();
    }
}
