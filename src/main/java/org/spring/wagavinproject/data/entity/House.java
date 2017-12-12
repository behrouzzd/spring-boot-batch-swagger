package org.spring.wagavinproject.data.entity;

import org.spring.wagavinproject.data.enums.HouseType;

import javax.persistence.*;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
@Entity
public class House {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String address;

    @Column
    private String zipCode;

    @Column
    @Enumerated(EnumType.STRING)
    private HouseType houseType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
