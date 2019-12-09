package com.zipcodeWilmington.Bean.Learner.Lab;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    private List<PersonType> personList;


    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(Long personTypeId) {
        if (personList.contains(personTypeId)) {
            personList.remove(personTypeId);
        }
    }

    public Integer getPersonListSize() {
        return personList.size();
    }

    public void clearPersonList() {
        personList.clear();
    }

    public void addAllToPersonList(Iterable<PersonType> personList) {
        ArrayList<PersonType> listOfPersons = new ArrayList<>();
        for (PersonType i : personList) {
            listOfPersons.add(i);
        }
    }

    public PersonType findById(Long id) {
        for (PersonType i : personList) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public List<PersonType> findAllPersons()   {
        return personList;
    }


}
