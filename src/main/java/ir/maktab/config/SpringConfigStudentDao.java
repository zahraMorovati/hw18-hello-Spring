package ir.maktab.config;

import ir.maktab.dao.StudentDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigStudentDao {

    @Bean
    public StudentDao studentDao(){
        return new StudentDao();
    }
}
