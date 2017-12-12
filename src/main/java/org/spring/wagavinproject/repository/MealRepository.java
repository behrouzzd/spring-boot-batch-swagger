package org.spring.wagavinproject.repository;

import org.spring.wagavinproject.data.entity.Meal;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
public interface MealRepository extends PagingAndSortingRepository<Meal, Long> {
}
