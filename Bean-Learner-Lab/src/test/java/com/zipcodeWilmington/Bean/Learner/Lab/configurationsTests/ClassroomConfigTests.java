package com.zipcodeWilmington.Bean.Learner.Lab.configurationsTests;

import com.zipcodeWilmington.Bean.Learner.Lab.entities.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomConfigTests {


    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;


    @Test
    public void currentCohortTest() {
        Instructor instructor1 = new Instructor(4L);
        Student student1 = new Student(2L);
        Instructors instructors10 = new Instructors();
        Students students10 = new Students();
        instructors10.add(instructor1);
        students10.add(student1);
        currentCohort = new Classroom(instructors10, students10);

        Assert.assertEquals(instructor1, currentCohort.getInstructors().findById(4L));
        Assert.assertEquals(student1, currentCohort.getStudents().findById(2L));
    }


    @Test public void previousCohortTest()  {
        Instructor instructor1 = new Instructor(4L);
        Student student1 = new Student(2L);
        Instructors instructors10 = new Instructors();
        Students students10 = new Students();
        instructors10.add(instructor1);
        students10.add(student1);
        previousCohort = new Classroom(instructors10, students10);

        Assert.assertEquals(instructor1, previousCohort.getInstructors().findById(4L));
        Assert.assertEquals(student1, previousCohort.getStudents().findById(2L));
        previousCohort = new Classroom(new Instructors(), new Students());



    }



}
