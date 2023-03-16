package com.stanislav.FirstRestApp.repositories;

import com.stanislav.FirstRestApp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Stanislav Hlova
 */
@Repository
public interface PeopleRepository extends JpaRepository<Person,Integer> {

}
