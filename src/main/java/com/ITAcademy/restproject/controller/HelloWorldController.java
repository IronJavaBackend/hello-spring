package com.ITAcademy.restproject.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Simple Hello World with Spring
 *
 * @author Elena Piaggio
 */
@RestController
public class HelloWorldController {

    private static final String template = "Hallo, ";

    @RequestMapping("/{name}")
    public String helloGradle(@PathVariable String name) {
        return template + name + "!!!";
    }
}
