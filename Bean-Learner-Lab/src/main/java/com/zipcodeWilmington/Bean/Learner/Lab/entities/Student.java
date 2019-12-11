package com.zipcodeWilmington.Bean.Learner.Lab.entities;

import com.zipcodeWilmington.Bean.Learner.Lab.repositories.Learner;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(Long id) {
        super(id);
    }


    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }

    @Override
    public void learn(double numOfHours) {
        totalStudyTime += numOfHours;
    }
}
