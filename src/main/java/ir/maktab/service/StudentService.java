package ir.maktab.service;

import ir.maktab.dao.StudentDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentService {

    // old way
       /* StudentDao studentDao = new StudentDao();
        studentDao.delete();*/

    //new way
    ClassPathXmlApplicationContext
            context=
            new ClassPathXmlApplicationContext("applicationContext.xml");
    // by name
    StudentDao studentDao = (StudentDao) context.getBean("StudentDao");
    // by class
    StudentDao studentDao1 = context.getBean(StudentDao.class);

    public void saveNewStudent(){
        studentDao.save();
    }

    public void removeStudent(){
        studentDao1.delete();
    }
}
