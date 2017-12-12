package org.spring.wagavinproject.controller.dto;

import java.util.List;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
public class ChildInfo {

    private String name;

    private Integer age;

    private ParentInfo parentInfo;

    private List<MealInfo> mealInfoList;

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

    public ParentInfo getParentInfo() {
        return parentInfo;
    }

    public void setParentInfo(ParentInfo parentInfo) {
        this.parentInfo = parentInfo;
    }

    public List<MealInfo> getMealInfoList() {
        return mealInfoList;
    }

    public void setMealInfoList(List<MealInfo> mealInfoList) {
        this.mealInfoList = mealInfoList;
    }
}
