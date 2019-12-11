package com.zipcodeWilmington.Bean.Learner.Lab;

public class Student extends Person implements Learner{

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
