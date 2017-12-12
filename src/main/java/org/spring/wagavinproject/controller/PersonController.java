package org.spring.wagavinproject.controller;

import org.spring.wagavinproject.controller.dto.ChildInfo;
import org.spring.wagavinproject.controller.dto.ColorInfo;
import org.spring.wagavinproject.controller.dto.HouseInfo;
import org.spring.wagavinproject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * Created by Behrouz-ZD on 12/10/2017.
 */
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;


    @RequestMapping(path = "/persons/{person_id}/house", method = RequestMethod.GET)
    public HouseInfo getHouseInfo(@NotNull @PathVariable("person_id") Long personId) {
        return personService.getHouseInfo(personId);
    }

    @RequestMapping(path = "/children/{child_id}/info", method = RequestMethod.GET)
    public ChildInfo getChildInfo(@NotNull @PathVariable("child_id") Long childId) {
        return personService.getChildInfo(childId);
    }

    @RequestMapping(path = "/children/{child_id}/color", method = RequestMethod.GET)
    public ColorInfo getColor(@NotNull @PathVariable("child_id") Long childId) {
        return personService.getColorInfo(childId);
    }
}
