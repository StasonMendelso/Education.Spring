package com.stanislav.FirstRestApp.controllers;

import com.stanislav.FirstRestApp.models.Person;
import com.stanislav.FirstRestApp.services.PeopleService;
import com.stanislav.FirstRestApp.util.PersonErrorResponse;
import com.stanislav.FirstRestApp.util.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Stanislav Hlova
 */
@RestController
@RequestMapping("/people")
public class PeopleController {
    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping()
    public List<Person> getAllPersons() {
        return peopleService.findAll();
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return peopleService.findOne(id);
    }

    @ExceptionHandler(value = PersonNotFoundException.class)
    private ResponseEntity<PersonErrorResponse> handleException(PersonNotFoundException exception) {
        PersonErrorResponse personErrorResponse = new PersonErrorResponse("Person with this id wasn't found", System.currentTimeMillis());
        return new ResponseEntity<>(personErrorResponse, HttpStatus.NOT_FOUND);
    }
}
