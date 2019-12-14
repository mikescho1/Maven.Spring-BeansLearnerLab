package com.zipcodeWilmington.Bean.Learner.Lab.configurationsTests;

import com.zipcodeWilmington.Bean.Learner.Lab.entities.Instructor;
import com.zipcodeWilmington.Bean.Learner.Lab.entities.Instructors;
import org.junit.Assert;
import org.junit.Before;
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

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;




    @Test
    public void tcUsaInstructors()  {
        Assert.assertTrue(tcUsaInstructors.size() == 1);
    }

    @Test
    public void setTcUkInstructors()  {
        Assert.assertTrue(tcUkInstructors.size() == 2);
    }

    @Test
    public void instructors() {
        Assert.assertTrue(instructors.size() == 2);
    }
}
