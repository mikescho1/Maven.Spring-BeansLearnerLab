package com.zipcodeWilmington.Bean.Learner.Lab.configurationsTests;

import com.zipcodeWilmington.Bean.Learner.Lab.entities.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTests {

    private Alumni alumni;





    @Test
    public void executeBootCampTest()    {

        for(Student i : alumni.getStudents())    {
            Assert.assertEquals(2400, i.getTotalStudyTime(),.01);
        }
    }
}
