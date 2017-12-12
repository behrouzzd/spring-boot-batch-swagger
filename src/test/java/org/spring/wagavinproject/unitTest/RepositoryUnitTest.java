package org.spring.wagavinproject.unitTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.wagavinproject.SpringBootApplicationRunner;
import org.spring.wagavinproject.data.entity.House;
import org.spring.wagavinproject.data.entity.Meal;
import org.spring.wagavinproject.data.entity.Person;
import org.spring.wagavinproject.data.enums.HouseType;
import org.spring.wagavinproject.repository.HouseRepository;
import org.spring.wagavinproject.repository.MealRepository;
import org.spring.wagavinproject.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes = SpringBootApplicationRunner.class,
        webEnvironment = SpringBootTest.WebEnvironment.NONE)

public class RepositoryUnitTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private HouseRepository houseRepository;

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void testSavePerson() {

        //create a house
        House house = new House();
        house.setAddress("Kolb str 1,Stuttgart, Germany");
        house.setHouseType(HouseType.HOUSE);
        house.setZipCode("70199");

        entityManager.persist(house);
        entityManager.flush();

        //create a house
        Person person = new Person();
        person.setHouse(house);
        person.setName("Behrouz Zamani");
        person.setAge(20);

        entityManager.persist(person);
        entityManager.flush();

        // when
        Person found = personRepository.findOne(person.getId());

        // then
        assertNotNull(found);
        assertEquals(found.getId(), person.getId());
        assertNotNull(found.getHouse());
        assertEquals(found.getHouse().getId(), house.getId());

    }

    @Test
    public void testSaveHouse() {

        //create a house
        House house = new House();
        house.setAddress("Kolb str 1,Stuttgart, Germany");
        house.setHouseType(HouseType.HOUSE);
        house.setZipCode("70199");

        entityManager.persist(house);
        entityManager.flush();

        // when
        House found = houseRepository.findOne(house.getId());

        // then
        assertNotNull(found);
        assertEquals(found.getId(), house.getId());
    }

    @Test
    public void testSaveMeal() {

        //create a meal
        Meal meal = new Meal();
        meal.setInvented(new Date());
        meal.setName("meal#");

        entityManager.persist(meal);
        entityManager.flush();

        // when
        Meal found = mealRepository.findOne(meal.getId());

        // then
        assertNotNull(found);
        assertEquals(found.getId(), meal.getId());
    }

}
