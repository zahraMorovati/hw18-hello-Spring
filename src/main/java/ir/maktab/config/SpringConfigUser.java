package ir.maktab.config;

import ir.maktab.dao.UserDao;
import ir.maktab.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigUser {

    @Bean
    public UserDao userDao(){
        return new UserDao();
    }

    @Bean
    public UserService userService(UserDao userDao){
        UserService userService = new UserService();
        userService.setUserDao(userDao);
        return userService;
    }
}
