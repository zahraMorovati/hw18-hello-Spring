package ir.maktab.config;

import ir.maktab.dao.StudentDao;
import ir.maktab.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public StudentDao studentDao(){
        return new StudentDao();
    }

    @Bean
    public StudentService studentService(StudentDao studentDao){
        StudentService studentService = new StudentService();
        studentService.setStudentDao(studentDao);
        return studentService;
    }
}
