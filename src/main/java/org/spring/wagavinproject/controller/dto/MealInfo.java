package org.spring.wagavinproject.controller.dto;

import java.util.Date;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
public class MealInfo {

    private String name;

    private Date invented;

    public MealInfo(String name, Date invented) {
        this.name = name;
        this.invented = invented;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getInvented() {
        return invented;
    }

    public void setInvented(Date invented) {
        this.invented = invented;
    }
}
