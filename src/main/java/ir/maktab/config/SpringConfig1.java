package ir.maktab.config;

import ir.maktab.dao.StudentDao;
import ir.maktab.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig1 {

    @Bean
    public StudentDao studentDao(){
        return new StudentDao();
    }
}
