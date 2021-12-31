package ir.maktab.view;

import ir.maktab.dao.StudentDao;
import ir.maktab.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXmlInsideXmlBeans {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context1 =
                new ClassPathXmlApplicationContext("appContextStudentDao.xml");
        ClassPathXmlApplicationContext context2 =
                new ClassPathXmlApplicationContext("appContextStudentService.xml");
        StudentDao studentDao = (StudentDao) context1.getBean("studentDao");
        StudentService studentService = (StudentService) context2.getBean("studentService");

        System.out.println("******* spring class get bean");
        studentDao.save();
        studentService.removeStudent();
    }
}
