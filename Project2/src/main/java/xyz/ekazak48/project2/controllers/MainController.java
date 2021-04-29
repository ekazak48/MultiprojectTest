package xyz.ekazak48.project2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/helloworld")
    public String helloWorld() {return "hello, world!";}

    @GetMapping("/getServiceNumber")
    public String getServiceNumber() {
        return "2";
    }
}
