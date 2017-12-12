package org.spring.wagavinproject.repository;

import org.spring.wagavinproject.data.entity.ParentSummary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
@Repository
public interface ParentSummaryRepository extends PagingAndSortingRepository<ParentSummary, Long> {

    @Query(value = "SELECT child_count as amount_Of_children,COUNT(1) as amount_of_persons " +
            "FROM " +
            "(SELECT ch.parent_id,count(1) as child_count " +
            " FROM Child ch GROUP BY ch.parent_id ) as T " +
            " GROUP BY child_count ", nativeQuery = true)
    List<ParentSummary> findAllSummary();

}

