package org.spring.wagavinproject.service;

import org.spring.wagavinproject.data.entity.House;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */

@Service
public interface HouseService {

    @Transactional
    House save(House house);

    @Transactional
    void update(House house);

    @Transactional
    void remove(House house);

    House findById(Long houseId);

}
