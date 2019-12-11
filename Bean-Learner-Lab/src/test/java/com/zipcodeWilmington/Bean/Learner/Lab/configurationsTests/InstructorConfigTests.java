package com.zipcodeWilmington.Bean.Learner.Lab.configurationsTests;

import com.zipcodeWilmington.Bean.Learner.Lab.entities.Instructor;
import com.zipcodeWilmington.Bean.Learner.Lab.entities.Instructors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorConfigTests {



    @Autowired
    @Qualifier("tcUsaInstructors")
    Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    Instructors tcUkInstructors;


    @Test
    public void tcUsaInstructors()  {
        tcUsaInstructors = new Instructors();
        Instructor instructor1 = new Instructor(5L);
        tcUsaInstructors.add(instructor1);
        Assert.assertEquals(1, tcUsaInstructors.size());
    }

    @Test
    public void setTcUkInstructors()  {
        tcUkInstructors = new Instructors();
        Instructor instructor1 = new Instructor(5L);
        tcUkInstructors.add(instructor1);
        Assert.assertEquals(1, tcUkInstructors.size());
    }
}
