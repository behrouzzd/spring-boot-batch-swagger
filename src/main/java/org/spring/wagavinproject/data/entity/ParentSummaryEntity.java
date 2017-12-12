package org.spring.wagavinproject.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */

@Entity
public class ParentSummaryEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "amount_of_children")
    private Long amountOfChildren;

    @Column(name = "amount_of_persons")
    private Long amountOfPersons;

    public Long getAmountOfPersons() {
        return amountOfPersons;
    }

    public void setAmountOfPersons(Long amountOfPersons) {
        this.amountOfPersons = amountOfPersons;
    }

    public Long getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(Long amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
