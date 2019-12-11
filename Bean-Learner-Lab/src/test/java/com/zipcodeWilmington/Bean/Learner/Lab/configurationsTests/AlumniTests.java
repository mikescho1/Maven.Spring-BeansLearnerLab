package com.zipcodeWilmington.Bean.Learner.Lab.configurationsTests;

import com.zipcodeWilmington.Bean.Learner.Lab.entities.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


public class AlumniTests {



    @Test
    public void numberOfHoursTaughtTest()    {
        Student student1 = new Student(5L);
        Student student2 = new Student(6L);
        Instructor instructor1 = new Instructor(9L);
        Instructor instructor2 = new Instructor(10L);
        Students students100 = new Students();
        Instructors instructors100 = new Instructors();

        students100.add(student1);
        students100.add(student2);
        instructors100.add(instructor1);
        instructors100.add(instructor2);

        Alumni alumni = new Alumni(instructors100, students100);



        alumni.executeBootCamp();
        int actual = 0;

        for(Student i : students100)    {
            actual += i.getTotalStudyTime();
        }

        Assert.assertEquals(2400, actual);





    }
}
