package ir.maktab.dao;

import org.springframework.stereotype.Component;
//@Primary
@Component
public class UserDao {
    public void save(){
        System.out.println("user saved!");
    }

    public void delete(){
        System.out.println("user removed!");
    }
}
