package assignment33;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentInfo {
    ArrayList<Student> resume = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter number of Students that you want to add: ");
        int noOfStudent = sc.nextInt();
        for (int i = 0; i < noOfStudent; i++) {
            System.out.println("Enter Student PRN: ");
            int prn = sc.nextInt();
            System.out.println("Enter student name: ");
            String name = sc.next();
            System.out.println("Enter student DOB: ");
            String DOB = sc.next();
            Student b = new Student(prn, name, DOB);
            resume.add(b);
        }
    }

    public void printStudentDetails() {
        System.out.println("--- Student Information ---");
        for (int i = 0; i < resume.size(); i++) {
            printStudent(i);
        }
    }

    public void printStudent(int i) {
        System.out.println("Student Id" + "\t" + "Student name" + "\t" + "Student PRN");
        System.out.println(resume.get(i).getPrn() + "   " +
                resume.get(i).getName() + "  " +
                resume.get(i).getDob());
    }

    public void deleteStudent() {
        System.out.println("Enter Student PRN for deleting the StudentInfo");
        int StdPrn = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < resume.size(); i++) {
            if (resume.get(i).getPrn() == StdPrn) {
                System.out.println(resume.get(i).getName() + " deleted from ArrayList");
                resume.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with PRN " + StdPrn + " not available");
        }
    }
}