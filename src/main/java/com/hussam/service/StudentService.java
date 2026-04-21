package com.hussam.service;

import com.hussam.dao.StudentDAO;
import com.hussam.model.Student;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private final StudentDAO studentDAO = new StudentDAO();
    private final Scanner scanner = new Scanner(System.in);

    private Student readStudentInformation() {
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();

        System.out.println("Enter Phone: ");
        String phone = scanner.nextLine();

        System.out.println("Enter birthday: ");
        String birthday = scanner.nextLine();

        System.out.println("Enter firstMark: ");
        int firstMark = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter secondMark: ");
        int secondMark = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter finalMark: ");
        int finalMark = scanner.nextInt();
        scanner.nextLine();

        return new Student(id , name , email , phone , Date.valueOf(birthday) , firstMark , secondMark , finalMark);
    }

    private int readStudentID() {
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        return id;
    }

    private void operationCompleted() {
        System.out.println("Operation completed successfully!");
    }

    public void getAllStudents() {
        List<Student> listOfStudents = studentDAO.getAllStudents();
        for(Student student : listOfStudents) {
            System.out.println(student);
        }
        operationCompleted();
    }
    public void insertStudent() {
        Student student = readStudentInformation();
        studentDAO.insertStudent(student);
        operationCompleted();
    }

    public void updateStudent() {
        Student student = readStudentInformation();
        studentDAO.updateStudent(student);
        operationCompleted();
    }

    public void deleteStudent() {
        int id = readStudentID();
        studentDAO.deleteStudent(id);
        operationCompleted();
    }
    public void searchStudentById() {
        int id = readStudentID();
        Student student = studentDAO.searchStudentById(id);

        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found!");
        }
        operationCompleted();
    }
}
