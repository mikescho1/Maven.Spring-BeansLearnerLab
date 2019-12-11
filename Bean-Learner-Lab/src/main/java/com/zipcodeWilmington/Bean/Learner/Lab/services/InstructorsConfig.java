package com.zipcodeWilmington.Bean.Learner.Lab.services;

import com.zipcodeWilmington.Bean.Learner.Lab.entities.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors()   {
        return null;
    }


    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors()    {
        return null;
    }

    @Bean
    @Primary
    public Instructors instructors()    {
        return null;
    }







}
