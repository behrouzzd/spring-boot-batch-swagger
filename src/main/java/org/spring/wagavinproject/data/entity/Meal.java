package org.spring.wagavinproject.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
@Entity
public class Meal {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private Date invented;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
