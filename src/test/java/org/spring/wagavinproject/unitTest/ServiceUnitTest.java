package org.spring.wagavinproject.unitTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.spring.wagavinproject.data.entity.House;
import org.spring.wagavinproject.data.entity.Meal;
import org.spring.wagavinproject.data.enums.HouseType;
import org.spring.wagavinproject.repository.HouseRepository;
import org.spring.wagavinproject.repository.MealRepository;
import org.spring.wagavinproject.service.HouseServiceImpl;
import org.spring.wagavinproject.service.MealServiceImpl;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ServiceUnitTest {

    @Mock
    private HouseRepository houseRepository;

    @Mock
    private MealRepository mealRepository;

    @InjectMocks
    private HouseServiceImpl houseService;

    @InjectMocks
    private MealServiceImpl mealService;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testSaveHouse() {

        //create a user
        House house = new House();
        house.setAddress("Kolb str 1,Stuttgart, Germany");
        house.setHouseType(HouseType.HOUSE);
        house.setZipCode("70199");

        when(houseRepository.save(any(House.class))).thenReturn(house);

        // save a user
        House newHouse = houseService.save(null);

        // verify the result
        assertNotNull(newHouse);
        assertEquals("Kolb str 1,Stuttgart, Germany", newHouse.getAddress());

    }


    @Test
    public void testSaveMeal() {

        //create a meal
        Meal meal = new Meal();
        meal.setInvented(new Date());
        meal.setName("meal#");

        when(mealRepository.save(any(Meal.class))).thenReturn(meal);

        // save a user
        Meal newMeal = mealService.save(null);

        // verify the result
        assertNotNull(newMeal);
        assertEquals("meal#", newMeal.getName());

    }

}
