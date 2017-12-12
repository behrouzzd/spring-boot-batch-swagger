package org.spring.wagavinproject.service;

import org.spring.wagavinproject.data.entity.Meal;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
public interface MealService {

    @Transactional
    Meal save(Meal meal);

    @Transactional
    void update(Meal meal);

    @Transactional
    void remove(Meal meal);
}
