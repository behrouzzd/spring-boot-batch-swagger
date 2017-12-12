package org.spring.wagavinproject.repository;

import org.spring.wagavinproject.data.entity.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
}
