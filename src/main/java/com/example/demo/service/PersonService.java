package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.PersonDaoInterface;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService 
{
    private final PersonDaoInterface personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDaoInterface personDao)
    {
        this.personDao = personDao;
    }

    public int addPerson(Person person)
    {
        return this.personDao.insertPerson(person);
    }

    public List<Person> getAllPeople()
    {
        return this.personDao.selectAllPeople();    
    }
}
