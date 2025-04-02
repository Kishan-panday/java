import java.util.*;
import java.util.regex.*;

// Custom Exception for Invalid Phone Number
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Email ID
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

// Student Class to store details
class Student {
    String name;
    String rollNo;
    String phoneNumber;
    String email;

    public Student(String name, String rollNo, String phoneNumber, String email) {
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Phone: " + phoneNumber + ", Email: " + email;
    }
}

public class StudentRecord {
    
    public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Invalid Phone Number: " + phoneNumber);
        }
    }
    
    public static void validateEmail(String rollNo, String email) throws InvalidEmailException {
        String expectedEmail = rollNo + "@kiit.ac.in";
        if (!email.equals(expectedEmail)) {
            throw new InvalidEmailException("Invalid Email ID: " + email);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Enter details for Student " + (i + 1) + " (Name, Roll No, Phone No, Email):");
                String name = scanner.next();
                String rollNo = scanner.next();
                String phoneNumber = scanner.next();
                String email = scanner.next();
                
                validatePhoneNumber(phoneNumber);
                validateEmail(rollNo, email);
                
                students.add(new Student(name, rollNo, phoneNumber, email));
            } catch (InvalidPhoneNumberException | InvalidEmailException e) {
                System.out.println("Error: " + e.getMessage() + " Record discarded.");
            }
        }
        
        // Sorting the student records by name
        students.sort(Comparator.comparing(student -> student.name));
        
        // Printing sorted student records
        System.out.println("\nSorted Student Records:");
        for (Student student : students) {
            System.out.println(student);
        }
        
        scanner.close();
    }
}