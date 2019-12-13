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

    private Instructors instructors10;
    private Students student10;

    private Instructor instructor1;
    private Student student1;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;



    @Test
    public void currentCohortTest() {
        Assert.assertTrue(currentCohort.getInstructors().findById(4L) == instructor1);
        Assert.assertTrue(currentCohort.getStudents().findById(2L) == student1);
    }


    @Test
    public void previousCohortTest() {
        Assert.assertTrue(previousCohort.getInstructors().findById(4L) == instructor1);
        Assert.assertTrue(previousCohort.getStudents().findById(2L) == student1);
    }


}
