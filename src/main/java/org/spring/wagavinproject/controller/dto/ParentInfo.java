package org.spring.wagavinproject.controller.dto;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
public class ParentInfo {

    private String name;

    private Integer age;

    public ParentInfo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
