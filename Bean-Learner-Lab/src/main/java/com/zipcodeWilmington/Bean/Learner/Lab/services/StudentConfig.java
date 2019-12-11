package com.zipcodeWilmington.Bean.Learner.Lab.services;

import com.zipcodeWilmington.Bean.Learner.Lab.entities.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents()   {
        return null;
    }

    @Bean(name = "previousStudents")
    public Students previousStudents()  {
        return null;
    }












}
