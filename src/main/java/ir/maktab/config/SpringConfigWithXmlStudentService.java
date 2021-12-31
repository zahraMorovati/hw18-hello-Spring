package ir.maktab.config;

import ir.maktab.dao.StudentDao;
import ir.maktab.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath:appContextStudentDao.xml"})
@Configuration
public class SpringConfigWithXmlStudentService {

    @Bean
    public StudentService studentService(StudentDao studentDao){
        StudentService studentService = new StudentService();
        studentService.setStudentDao(studentDao);
        return studentService;
    }

}
