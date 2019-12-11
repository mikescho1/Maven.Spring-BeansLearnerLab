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
    public void currentStudents()   {
        currentStudents = new Students();
        Student student1 = new Student(2L);
        Student student2 = new Student(3L);
        currentStudents.add(student1);
        currentStudents.add(student2);
        Assert.assertEquals(2, (int) currentStudents.size());
    }

    @Test
    public void previousStudents()   {
        previousStudents = new Students();
        Student student1 = new Student(2L);
        Student student2 = new Student(3L);
        previousStudents.add(student1);
        previousStudents.add(student2);
        Assert.assertEquals(2, (int) previousStudents.size());
    }
}
