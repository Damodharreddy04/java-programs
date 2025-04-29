import java.util.*;

class UniversityCourse {
    LinkedList<String> students = new LinkedList<>();

    void enrollStudent(String name) {
        students.add(name);
    }
}

class CourseEnrollmentSystem {
    public static void main(String[] args) {
        UniversityCourse course = new UniversityCourse();
        course.enrollStudent("Bharath");
        course.enrollStudent("Ajay");
        course.enrollStudent("Damu");
        System.out.println("Enrolled Students: " + course.students);
    }
}