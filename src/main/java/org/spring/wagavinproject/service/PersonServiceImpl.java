package org.spring.wagavinproject.service;

import org.spring.wagavinproject.controller.dto.ChildInfo;
import org.spring.wagavinproject.controller.dto.ColorInfo;
import org.spring.wagavinproject.controller.dto.HouseInfo;
import org.spring.wagavinproject.data.entity.Child;
import org.spring.wagavinproject.data.entity.Person;
import org.spring.wagavinproject.repository.ChildRepository;
import org.spring.wagavinproject.repository.PersonRepository;
import org.spring.wagavinproject.utils.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
@Component
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private ChildRepository childRepository;

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void update(Person person) {
        personRepository.save(person);
    }

    @Override
    public void remove(Person person) {
        personRepository.delete(person);
    }

    @Override
    public Person findByPersonId(Long personId) {
        return personRepository.findOne(personId);
    }

    @Override
    public Child save(Child child) {
        return childRepository.save(child);
    }

    @Override
    public void update(Child child) {
        childRepository.save(child);
    }

    @Override
    public void remove(Child child) {
        childRepository.delete(child);
    }

    @Override
    public ChildInfo getChildInfo(Long childId) {
        return EntityMapper.mapChildInfo(childRepository.findOne(childId));
    }

    @Override
    public ColorInfo getColorInfo(Long childId) {
        return EntityMapper.mapColorInfo(childRepository.findOne(childId));
    }

    @Override
    public HouseInfo getHouseInfo(Long personId) {

        Person person = personRepository.findOne(personId);

        if (person == null)
            throw new EntityNotFoundException("Person not found!");

        return EntityMapper.mapHouseInfo(person);

    }
}
