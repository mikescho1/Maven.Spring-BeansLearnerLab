package com.zipcodeWilmington.Bean.Learner.Lab.configurations;

import com.zipcodeWilmington.Bean.Learner.Lab.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @DependsOn({"instructors", "students"})
    @Bean(name = "currentCohort")
    public Classroom currentCohort(Instructors instructors, Students students) {
//        Instructor instructor1 = new Instructor(4L);
//        Student student1 = new Student(2L);
//        Instructors instructors10 = instructors;
//        Students students10 = students;
//        instructors10.add(instructor1);
//        students10.add(student1);
        Classroom currentCohort = new Classroom(instructors, students);
        return currentCohort;

    }

    @DependsOn({"instructors", "previousStudents"})
    @Bean(name = "previousCohort")
    public Classroom previousCohort(Instructors instructors, Students students)   {
//        Instructor instructor1 = new Instructor(100L);
//        Student student1 = new Student(2L);
//        Instructors instructors10 = instructors;
//        Students students10 = students;
//        instructors10.add(instructor1);
//        students10.add(student1);
        Classroom previousCohort = new Classroom(instructors, students);
        return previousCohort;
    }







}
