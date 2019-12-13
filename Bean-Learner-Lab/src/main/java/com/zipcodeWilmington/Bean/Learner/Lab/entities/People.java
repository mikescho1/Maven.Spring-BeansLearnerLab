package com.zipcodeWilmington.Bean.Learner.Lab.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {


    private ArrayList<PersonType> personList;


    public People() {
        personList = new ArrayList<>();
    }

    public People(ArrayList<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType person)  {
        personList.add(person);
    }

    public void remove(PersonType person)   {
        personList.remove(person);
    }

    public int size()   {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> listOfPersons)  {
        for(PersonType i : listOfPersons)   {
            personList.add(i);
        }
    }

    public PersonType findById(Long id) {
        for(PersonType i : personList)  {
            if(i.getId() == id) {
                return i;
            }
        }   return null;
    }


    public ArrayList<PersonType> findAll()  {
        return personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }

    @Override
    public void forEach(Consumer<? super PersonType> action) {
        personList.forEach(action);

    }

    @Override
    public Spliterator<PersonType> spliterator() {
        return personList.spliterator();
    }
}
