package com.zipcodeWilmington.Bean.Learner.Lab.configurations;

import com.zipcodeWilmington.Bean.Learner.Lab.entities.Instructor;
import com.zipcodeWilmington.Bean.Learner.Lab.entities.Instructors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {


    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        Instructors tcUsaInstructors = new Instructors();
        Instructor instructor1 = new Instructor(5L);
        tcUsaInstructors.add(instructor1);
        return new Instructors();
    }


    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors() {
        Instructors tcUkInstructors = new Instructors();
        Instructor instructor1 = new Instructor(5L);
        tcUkInstructors.add(instructor1);
        return new Instructors();
    }


    @Primary
    @Bean
    public Instructors instructors() {
        return new Instructors();
    }


}
