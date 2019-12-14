package com.zipcodeWilmington.Bean.Learner.Lab.configurations;

import com.zipcodeWilmington.Bean.Learner.Lab.entities.Student;
import com.zipcodeWilmington.Bean.Learner.Lab.entities.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {





    @Bean(name = "students")
    public Students currentStudents() {
        Students currentStudents = new Students();
        currentStudents = new Students();
        Student student1 = new Student(2L);
        Student student2 = new Student(3L);
        currentStudents.add(student1);
        currentStudents.add(student2);
        return currentStudents;
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        Students previousStudents = new Students();
        Student student1 = new Student(2L);
        Student student2 = new Student(3L);
        previousStudents.add(student1);
        previousStudents.add(student2);

        return previousStudents;
    }


}
