package org.spring.wagavinproject.service;

import org.spring.wagavinproject.data.entity.Meal;
import org.spring.wagavinproject.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
public class MealServiceImpl implements MealService {

    @Autowired
    private MealRepository mealRepository;

    @Override
    public Meal save(Meal meal) {
        return mealRepository.save(meal);
    }

    @Override
    public void update(Meal meal) {
        mealRepository.save(meal);
    }

    @Override
    public void remove(Meal meal) {
        mealRepository.delete(meal);
    }
}
