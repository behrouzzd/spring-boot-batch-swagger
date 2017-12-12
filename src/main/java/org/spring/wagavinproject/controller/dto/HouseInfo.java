package org.spring.wagavinproject.controller.dto;

import org.spring.wagavinproject.data.enums.HouseType;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
public class HouseInfo {

    private String personName;

    private String address;

    private String zipCode;

    private HouseType houseType;

    public HouseInfo(String personName, String address, String zipCode, HouseType houseType) {
        this.personName = personName;
        this.address = address;
        this.zipCode = zipCode;
        this.houseType = houseType;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }
}
