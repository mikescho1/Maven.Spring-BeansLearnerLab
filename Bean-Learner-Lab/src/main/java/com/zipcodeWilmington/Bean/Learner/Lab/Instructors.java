package com.zipcodeWilmington.Bean.Learner.Lab;

import java.util.*;
import java.util.function.Consumer;

public class Instructors extends People<Instructor> {


    public Instructors(ArrayList<Instructor> personList) {
        super(personList);
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }
}
