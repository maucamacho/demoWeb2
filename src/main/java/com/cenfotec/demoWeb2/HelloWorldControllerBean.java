package com.cenfotec.demoWeb2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControllerBean {
    @GetMapping(path="/hola-mundo-bean")
    public HelloWorldBean helloWorldBean()
    {
        return new HelloWorldBean("Hola Mundo");
    }

    @GetMapping(path="/hola-mundo/variable/{nombre}")
    public HelloWorldBean helloWorldBean(@PathVariable String nombre)
    {
        return new HelloWorldBean(String.format("Hola Mundo, %s",nombre));
    }
}
