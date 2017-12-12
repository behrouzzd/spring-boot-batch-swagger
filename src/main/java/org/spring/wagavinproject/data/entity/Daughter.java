package org.spring.wagavinproject.data.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */

@Entity
@DiscriminatorValue("FEMALE")
public class Daughter extends Child {

    @Column
    private String hairColor;

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String getColor() {
        return hairColor;
    }
}
