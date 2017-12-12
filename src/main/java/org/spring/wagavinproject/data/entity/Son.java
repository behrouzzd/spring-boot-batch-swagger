package org.spring.wagavinproject.data.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
@Entity
@DiscriminatorValue("MALE")
public class Son extends Child {

    @Column
    private String biCycleColor;

    public String getBiCycleColor() {
        return biCycleColor;
    }

    public void setBiCycleColor(String biCycleColor) {
        this.biCycleColor = biCycleColor;
    }

    @Override
    public String getColor() {
        return biCycleColor;
    }

}
