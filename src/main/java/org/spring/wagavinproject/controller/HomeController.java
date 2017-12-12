package org.spring.wagavinproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Behrouz-ZD on 12/12/2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String redirectToSwagger() {
        return "redirect:/swagger-ui.html";
    }

}
