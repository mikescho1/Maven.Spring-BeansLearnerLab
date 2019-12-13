package com.zipcodeWilmington.Bean.Learner.Lab.entities;

import com.zipcodeWilmington.Bean.Learner.Lab.repositories.Learner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Component
public class Alumni {

    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @Autowired
    @Qualifier("students")
    Students students;


    public Alumni(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    @PostConstruct
    public void executeBootCamp() {
        int numberOfHoursPerStudent = 1200;
        int totalLectureHours = numberOfHoursPerStudent * students.size();
        int numberOfHoursPerInstructor = totalLectureHours / instructors.size();
        for (Instructor i : instructors) {
            i.lecture(students, numberOfHoursPerInstructor);
        }
    }


    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }
}
