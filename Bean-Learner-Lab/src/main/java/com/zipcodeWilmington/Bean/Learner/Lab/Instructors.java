package com.zipcodeWilmington.Bean.Learner.Lab;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors extends People<Instructor> {


    public Instructors()    {
    }


    public Instructors(Iterable<Instructor> instructors) {    //TODO check if the instructors constructor is correct.
        super.addAllToPersonList(instructors);
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Instructor> action) {

    }

    @Override
    public Spliterator<Instructor> spliterator() {
        return null;
    }
}
