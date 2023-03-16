package com.stanislav.FirstRestApp.services;

import com.stanislav.FirstRestApp.models.Person;
import com.stanislav.FirstRestApp.repositories.PeopleRepository;
import com.stanislav.FirstRestApp.util.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Stanislav Hlova
 */
@Service
public class PeopleService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }
    public List<Person> findAll(){
        return peopleRepository.findAll();
    }
    public Person findOne(int id){
        return peopleRepository.findById(id).orElseThrow(PersonNotFoundException::new);
    }
}
