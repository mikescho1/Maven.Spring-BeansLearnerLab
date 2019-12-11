package com.zipcodeWilmington.Bean.Learner.Lab.configurations;

import com.zipcodeWilmington.Bean.Learner.Lab.entities.Classroom;
import com.zipcodeWilmington.Bean.Learner.Lab.entities.Instructors;
import com.zipcodeWilmington.Bean.Learner.Lab.entities.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @DependsOn({"instructors", "students"})
    @Bean(name = "currentCohort")
    public Classroom currentCohort(Instructors instructors, Students students) {
        return new Classroom(instructors, students);

    }

    @DependsOn({"instructors", "previousStudents"})
    @Bean(name = "previousCohort")
    public Classroom previousCohort(Instructors instructors, Students students)   {
        return new Classroom(instructors, students);
    }





}
