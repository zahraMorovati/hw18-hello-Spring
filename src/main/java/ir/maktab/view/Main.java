package ir.maktab.view;

import ir.maktab.service.StudentService;

public class Main {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        studentService.removeStudent();
        studentService.saveNewStudent();
    }
}
