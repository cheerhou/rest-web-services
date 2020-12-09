package com.cheerhou.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

/**
 * @author hcj
 * @Description controller example
 * @Date 2020/12/7
 */

@RestController
public class HelloWorldController {
    //NOTES: two annotations are the same
//    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
