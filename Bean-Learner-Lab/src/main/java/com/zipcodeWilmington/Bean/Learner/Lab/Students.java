package com.zipcodeWilmington.Bean.Learner.Lab;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends People<Student>{


    public Students(List<Student> personList) {
        super(personList);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }


}
