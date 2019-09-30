package com.cenfotec.demoWeb2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, path="/hola-mundo")
    //@GetMapping(path="/hola-mundo")
    public String HelloWorld()
    {
        return "Hola Mundo";
    }
}
