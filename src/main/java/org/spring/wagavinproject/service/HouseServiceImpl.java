package org.spring.wagavinproject.service;

import org.spring.wagavinproject.data.entity.House;
import org.spring.wagavinproject.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
@Component
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseRepository houseRepository;

    @Override
    public House save(House house) {
        return houseRepository.save(house);
    }

    @Override
    public void update(House house) {
        houseRepository.save(house);
    }

    @Override
    public void remove(House house) {
        houseRepository.delete(house);
    }


    @Override
    public House findById(Long houseId) {
        return houseRepository.findOne(houseId);
    }

}
