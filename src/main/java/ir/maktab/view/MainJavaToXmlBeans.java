package ir.maktab.view;

import ir.maktab.config.SpringConfigWithXmlStudentService;
import ir.maktab.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaToXmlBeans {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigWithXmlStudentService.class);

        StudentService studentService = (StudentService) context.getBean("studentService");

        System.out.println("******* spring class get bean");
        studentService.removeStudent();
        studentService.saveNewStudent();
    }
}
