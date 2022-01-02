package ir.maktab.service;
import ir.maktab.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Lazy //lazy is there less resource ins
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
/*
@DependsOn("userDao")
*/
@Service
@PropertySource({"classpath:config.properties"})
public class UserService {
    @Value("${x}")
    String name;
    UserDao userDao;
   /* @Autowired
    public UserService(String name,@Qualifier("userDao") UserDao userDao) {
        this.name = name;
        this.userDao = userDao;
    }*/

    public void saveUser() {
        userDao.save();
    }

    public void removeUser() {
        userDao.delete();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init (){
        System.out.println("userService initialized...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("userService destroyed :(");
    }

    @Autowired
    public void setUserDao(@Qualifier("userDao") UserDao userDao) {
        this.userDao = userDao;
    }
}
