package com.marcin.przyklad.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marcin on 2017-08-17.
 */
@RequestMapping("/rest/hello")
@RestController
public class HelloResources {

    @GetMapping("/all")
    public String hello(){
        return "Hello YouTube";
    }


    @GetMapping("/secured/all")
    public String securedHello(){
       return "Secured Hello";
    }
}
