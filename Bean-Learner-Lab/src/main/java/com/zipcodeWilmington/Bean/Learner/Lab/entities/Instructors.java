package com.zipcodeWilmington.Bean.Learner.Lab.entities;

import java.util.*;

public class Instructors extends People<Instructor> {


    public Instructors(ArrayList<Instructor> personList) {
        super(personList);
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }
}
