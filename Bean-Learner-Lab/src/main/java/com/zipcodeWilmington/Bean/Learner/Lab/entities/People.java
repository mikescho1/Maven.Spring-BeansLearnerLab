package com.zipcodeWilmington.Bean.Learner.Lab.entities;

import java.util.ArrayList;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    private ArrayList<PersonType> personList;



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
}
