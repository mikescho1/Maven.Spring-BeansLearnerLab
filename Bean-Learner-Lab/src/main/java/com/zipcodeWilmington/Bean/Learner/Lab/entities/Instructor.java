package com.zipcodeWilmington.Bean.Learner.Lab.entities;

import com.zipcodeWilmington.Bean.Learner.Lab.repositories.Learner;
import com.zipcodeWilmington.Bean.Learner.Lab.repositories.Teacher;

import java.util.ArrayList;

public class Instructor extends Person implements Teacher {


    public Instructor(Long id) {
        super(id);
    }


    @Override
    public void teach(Learner learner, double numOfHours) {
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numOfHours) {
        ArrayList<Learner> learnerList = new ArrayList<>();

        for (Learner i : learners) {
            learnerList.add(i);
        }
        int numOfLearners = learnerList.size();
        for (Learner i : learnerList) {
            i.learn(numOfHours / numOfLearners);
        }
    }
}
