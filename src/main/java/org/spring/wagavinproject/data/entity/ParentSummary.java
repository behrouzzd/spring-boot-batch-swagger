package org.spring.wagavinproject.data.entity;

import org.hibernate.annotations.Subselect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */

@Entity
@Subselect("")
public class ParentSummary {

    @Column(name = "amount_of_children")
    @Id
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

}
