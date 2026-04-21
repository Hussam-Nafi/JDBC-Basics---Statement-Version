package com.hussam.ui;

import com.hussam.dao.StudentDAO;
import com.hussam.service.StudentService;

import java.util.Scanner;

public class StudentMenu {
    private final StudentService studentService = new StudentService();
    private final Scanner scanner = new Scanner(System.in);

    public void printMenu() {
        System.out.println("\n===== STUDENT SYSTEM =====");
        System.out.println("1- Show All Students");
        System.out.println("2- Add Student");
        System.out.println("3- Update Student");
        System.out.println("4- Delete Student");
        System.out.println("5- Search Student");
        System.out.println("0- Exit");
        System.out.println("Enter choice: ");
    }

    public void start() {
        int choice;
        boolean condition = true;

        while(condition) {
            printMenu();

            if(scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input!");
                scanner.next();
                continue;
            }

            switch(choice) {
                case 0: condition = false;
                        break;
                case 1: studentService.getAllStudents();
                        break;
                case 2: studentService.insertStudent();
                        break;
                case 3: studentService.updateStudent();
                        break;
                case 4: studentService.deleteStudent();
                        break;
                case 5: studentService.searchStudentById();
                        break;
                default:
                    System.out.println("Something is wrong");
            }
        }
    }
}
