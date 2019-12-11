package com.zipcodeWilmington.Bean.Learner.Lab.configurations;

import com.zipcodeWilmington.Bean.Learner.Lab.entities.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents()   {
        return new Students();

    }

    @Bean
    public Students previousStudents()  {
        return new Students();
    }












}
