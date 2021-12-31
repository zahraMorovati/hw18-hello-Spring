package ir.maktab.config;

import ir.maktab.dao.StudentDao;
import ir.maktab.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = {SpringConfig1.class})
@Configuration
public class SpringConfig2 {

    @Bean
    public StudentService studentService(StudentDao studentDao){
        StudentService studentService = new StudentService();
        studentService.setStudentDao(studentDao);
        return studentService;
    }

}
