package org.spring.wagavinproject.service;

import org.spring.wagavinproject.controller.dto.ChildInfo;
import org.spring.wagavinproject.controller.dto.ColorInfo;
import org.spring.wagavinproject.controller.dto.HouseInfo;
import org.spring.wagavinproject.data.entity.Child;
import org.spring.wagavinproject.data.entity.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Behrouz-ZD on 12/4/2017.
 */
@Service
public interface PersonService {

    /**
     * Person section
     **/

    @Transactional
    Person save(Person person);

    @Transactional
    void update(Person person);

    @Transactional
    void remove(Person person);

    Person findByPersonId(Long personId);


    /**
     * Child Section
     **/

    @Transactional
    Child save(Child child);

    @Transactional
    void update(Child child);

    @Transactional
    void remove(Child child);

    ChildInfo getChildInfo(Long personId);

    ColorInfo getColorInfo(Long childId);

    /**
     * House Section
     */

    HouseInfo getHouseInfo(Long personId);

}
