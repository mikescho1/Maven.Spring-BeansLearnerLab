package com.zipcodeWilmington.Bean.Learner.Lab;

public interface Teacher {

    void teach(Learner learners, double numOfHours);


    void lecture(Iterable<? extends Learner> learners, double numOfHours);
}
