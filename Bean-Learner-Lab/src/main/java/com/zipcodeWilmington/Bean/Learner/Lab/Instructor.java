package com.zipcodeWilmington.Bean.Learner.Lab;

import org.assertj.core.internal.Iterables;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Instructor extends Person implements Teacher{




    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learners, double numOfHours) {
    learners.learn(numOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numOfHours) {

        ArrayList<Learner> listOfLearners = new ArrayList<>();
        double splitHours = numOfHours / listOfLearners.size();

        for(Learner i : learners)   {
            listOfLearners.add(i);
        }

        for(Learner i : learners)   {
            i.learn(splitHours);
        }
    }
}
