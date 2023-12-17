import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    protected static String[][] courses = {
        {"101", "Pemrograman Berbasis Objek", "Haris", "Metta"},
        {"102", "Statistika Industri", "Windy", "Amilia"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentID = 0;
        String studentName = null;
        boolean validID = false;

        System.out.println("Enter Student Name:");
        studentName = scanner.nextLine();


        while (!validID) {
            try {
                System.out.println("Enter Student ID:");
                studentID = scanner.nextInt();
                scanner.nextLine(); 

                validID = true; 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for student ID.");
                scanner.nextLine(); 
            }
        }

        System.out.println("Enter Courses to Enroll in (separated by commas):");
        String enrolledCourse = scanner.nextLine();

        System.out.println(" ");

        Student student = new Student(studentName, studentID);
        
        for (String[] course : courses) {
            System.out.println("Course ID: " + course[0] + ",\n" +
                               "Course Name: " + course[1] + "\n" +
                               " - Student: " + course[2] + "\n" +
                               " - Student: " + course[3] + "\n");
        }

        String[] courseArray = enrolledCourse.split(",");
        for (String courseID : courseArray) {
            student.enrollInCourse(courseID.trim());
        }

        System.out.println(student.getUserDetail());
        System.out.println(" ");

        Teacher teacher = new Teacher("Pak Yoga Raditnya", 1010101010);
        teacher.teachClass("Pemodelan Proses Bisnis");

        Admin admin = new Admin("Hudza", 2020202020);
        admin.manageSystem("university system");

        scanner.close();
    }   
}