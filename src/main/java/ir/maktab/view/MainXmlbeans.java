package ir.maktab.view;

import ir.maktab.dao.StudentDao;
import ir.maktab.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXmlbeans {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext
                context=
                new ClassPathXmlApplicationContext("appContextFullXml.xml");

        // by name
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
        System.out.println("******* studentDao context getBean by name");
        studentDao.delete();

        // by class
        StudentDao studentDao1 = context.getBean(StudentDao.class);
        System.out.println("******* studentDao context getBean by class");
        studentDao1.save();

        // with student service
        StudentService studentService = (StudentService) context.getBean("studentService");
        System.out.println("******* studentService context getBean by name");
        studentService.saveNewStudent();
    }
}
