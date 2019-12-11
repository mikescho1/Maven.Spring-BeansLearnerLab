package com.zipcodeWilmington.Bean.Learner.Lab.repositories;

public interface Teacher {

    void teach(Learner learner, double numOfHours);


    void lecture(Iterable<? extends Learner> learners, double numOfHours);
}
