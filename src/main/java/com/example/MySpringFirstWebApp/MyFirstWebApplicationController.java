package com.example.MySpringFirstWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class MyFirstWebApplicationController {

    @RequestMapping
    public String helloWorld()
    {
        return "Hello world from Spring";
    }

    @RequestMapping("/Status")
    public String Status()
    {
        String s = (java.time.LocalTime.now().toString());
        String str = "Running " + "{" + s + "}";
        return str;
    }
}
