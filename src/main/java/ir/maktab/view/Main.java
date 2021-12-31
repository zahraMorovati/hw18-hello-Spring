package ir.maktab.view;

import ir.maktab.config.SpringConfig;
import ir.maktab.dao.StudentDao;
import ir.maktab.service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

       /* StudentService studentService = new StudentService();
        studentService.removeStudent();
        studentService.saveNewStudent();*/
        // old way
       /* StudentDao studentDao = new StudentDao();
        studentDao.delete();*/

        //new way
        ClassPathXmlApplicationContext
                context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // by name
        StudentDao studentDao = (StudentDao) context.getBean("StudentDao");
        System.out.println("******* studentDao context getBean by name");
        studentDao.delete();

        // by class
        StudentDao studentDao1 = context.getBean(StudentDao.class);
        System.out.println("******* studentDao context getBean by class");
        studentDao1.save();

        // with student service
        StudentService studentService = (StudentService) context.getBean("StudentService");
        System.out.println("******* studentService context getBean by name");
        studentService.saveNewStudent();

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfig.class);
        studentDao= (StudentDao) context1.getBean("studentDao");
        studentService= (StudentService) context1.getBean("studentService");

        System.out.println("******* spring class get bean");
        studentDao.save();
        studentService.removeStudent();


    }
}
