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
        Instructors tcUsaInstructors1 = new Instructors();
        Instructor instructor1 = new Instructor(5L);
        tcUsaInstructors1.add(instructor1);
        return tcUsaInstructors1;
    }


    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors() {
        Instructors tcUkInstructors2 = new Instructors();
        Instructor instructor1 = new Instructor(5L);
        Instructor instructor2 = new Instructor(6L);
        tcUkInstructors2.add(instructor1);
        tcUkInstructors2.add(instructor2);
        return tcUkInstructors2;
    }

    @Bean
    @Primary
    public Instructors instructors() {
        Instructors instructors3 = new Instructors();
        Instructor instructor3 = new Instructor(7L);
        Instructor instructor4 = new Instructor(9L);



        instructors3.add(instructor3);
        instructors3.add(instructor4);

        return instructors3;
    }


}
