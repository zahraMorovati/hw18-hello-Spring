package ir.maktab.view;

import ir.maktab.config.SpringConfigUser;
import ir.maktab.dao.UserDao;
import ir.maktab.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigUser.class);

        UserDao userDao= (UserDao) context.getBean("userDao");
        UserService userService1= (UserService) context.getBean("userService");
        UserService userService2= (UserService) context.getBean("userService");
        userService1.setName("zahra");
        userService2.setName("mona");
        System.out.println("******* spring class get bean");
        userDao.save();
        System.out.println(userService1.getName());
        System.out.println(userService2.getName());

    }
}
