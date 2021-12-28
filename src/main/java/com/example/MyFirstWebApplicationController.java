package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstWebApplicationController {

    /**
     * @return str
     */
    @RequestMapping("/status")
    public String getTime() {
        String time = java.time.LocalTime.now().toString();
        String str = "Running " + "," + "{" + time + "}";
        return str;
    }

    /**
     * @return "KRISHNA JAISWAL"
     */
    @RequestMapping("/name")
    public String getName() {
        return "KRISHNA JAISWAL";
    }
}
