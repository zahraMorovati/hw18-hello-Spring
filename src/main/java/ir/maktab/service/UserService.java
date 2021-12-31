package ir.maktab.service;
import ir.maktab.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
@Scope("prototype")
@Service
public class UserService {

    String name;
    UserDao userDao;

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


    public void init (){
        System.out.println("userService initialized...");
    }



    @Autowired
    public void setUserDao(@Qualifier("userDao") UserDao userDao) {
        this.userDao = userDao;
    }
}
