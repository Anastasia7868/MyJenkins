package ru.aston.appolinarova.myFirstJenkinsJob;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    //test hook

    @GetMapping("/hello")
    public String sayHello() {
        return "hello_world";
    }
}
