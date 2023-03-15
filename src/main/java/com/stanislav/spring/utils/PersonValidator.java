package com.stanislav.spring.utils;

import com.stanislav.spring.models.Person;
import com.stanislav.spring.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Stanislav Hlova
 */
@Component
public class PersonValidator implements Validator {
    private final PeopleService peopleService;

    @Autowired
    public PersonValidator(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;

        if (peopleService.getPersonByUsername(person.getUsername()).isPresent()) {
            errors.rejectValue("username", "", "Людина з таким іменем вже існує.");
        }
    }
}
