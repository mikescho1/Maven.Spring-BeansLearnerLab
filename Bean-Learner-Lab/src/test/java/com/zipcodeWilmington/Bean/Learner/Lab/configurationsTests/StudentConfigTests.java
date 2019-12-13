package com.zipcodeWilmington.Bean.Learner.Lab.configurationsTests;

import com.zipcodeWilmington.Bean.Learner.Lab.entities.Student;
import com.zipcodeWilmington.Bean.Learner.Lab.entities.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTests {


    @Autowired
    @Qualifier("students")
    private Students currentStudents;


    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;



    @Test
    public void currentStudents() {
        Assert.assertTrue(this.currentStudents.size() == 2);
    }

    @Test
    public void previousStudents()   {
        Assert.assertTrue(this.previousStudents.size() == 2);
    }

}
