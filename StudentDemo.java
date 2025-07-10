import java.util.*;

// Custom Exception
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

// Abstract Class
abstract class Student {
    protected String name;
    protected int rollNumber;
    protected Double marks;

    Student(String name, int rollNumber, Double marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Abstract method
    abstract void calculateGrade();
}

// UGStudent class
class UGStudent extends Student {

    UGStudent(String name, int rollNumber, Double marks) throws InvalidMarksException {
        super(name, rollNumber, marks);
    }

    @Override
    void calculateGrade() {
        System.out.print("UG Student - ");
        display();
        if (marks >= 85) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Marks: " + marks);
    }
}

// PGStudent class
class PGStudent extends Student {

    PGStudent(String name, int rollNumber, Double marks) throws InvalidMarksException {
        super(name, rollNumber, marks);
    }

    @Override
    void calculateGrade() {
        System.out.print("PG Student - ");
        display();
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Marks: " + marks);
    }
}

// Main Class
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        try {
            students.add(new UGStudent("Alice", 101, 78.0));
            students.add(new PGStudent("Bob", 201, 88.5));
            students.add(new UGStudent("Charlie", 102, 56.5));
            students.add(new PGStudent("Diana", 202, 94.0));
            // This will throw an exception
            students.add(new UGStudent("ErrorStudent", 103, 120.0));
        } catch (InvalidMarksException e) {
            System.out.println("Error creating student: " + e.getMessage());
        }

        System.out.println("\nCalculating Grades using Polymorphism:\n");
        for (Student s : students) {
            s.calculateGrade();
            System.out.println();
        }

        sc.close();
    }
}