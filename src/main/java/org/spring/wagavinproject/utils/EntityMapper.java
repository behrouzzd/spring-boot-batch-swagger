package org.spring.wagavinproject.utils;

import org.spring.wagavinproject.controller.dto.*;
import org.spring.wagavinproject.data.entity.Child;
import org.spring.wagavinproject.data.entity.ColorSupport;
import org.spring.wagavinproject.data.entity.House;
import org.spring.wagavinproject.data.entity.Person;

import java.util.ArrayList;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
public class EntityMapper {

    public static HouseInfo mapHouseInfo(Person person) {
        if (person == null || person.getHouse() == null)
            return null;

        House house = person.getHouse();
        return new HouseInfo(person.getName(), house.getAddress(), house.getZipCode(), house.getHouseType());
    }


    public static ChildInfo mapChildInfo(Child child) {
        if (child == null)
            return null;

        ChildInfo childInfo = new ChildInfo();
        childInfo.setName(child.getName());
        childInfo.setAge(child.getAge());
        if (child.getMeals() != null && child.getMeals().size() > 0) {
            childInfo.setMealInfoList(new ArrayList<>());
            child.getMeals().stream().forEach(t -> {
                childInfo.getMealInfoList().add(new MealInfo(t.getName(), t.getInvented()));
            });
        }

        if (child.getParent() != null) {

            childInfo.setParentInfo(new ParentInfo(child.getParent().getName(), child.getParent().getAge()));
        }

        return childInfo;

    }

    public static ColorInfo mapColorInfo(ColorSupport colorSupport) {
        if (colorSupport == null)
            return null;

        return new ColorInfo(colorSupport.getColor());
    }


}
