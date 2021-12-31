package ir.maktab.view;

import ir.maktab.config.SpringConfigStudentDao;
import ir.maktab.config.SpringConfigStudentService;
import ir.maktab.dao.StudentDao;
import ir.maktab.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaBeans {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfigStudentDao.class);
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(SpringConfigStudentService.class);
        StudentDao studentDao= (StudentDao) context1.getBean("studentDao");
        StudentService studentService= (StudentService) context2.getBean("studentService");

        System.out.println("******* spring class get bean");
        studentDao.save();
        studentService.removeStudent();
    }
}
