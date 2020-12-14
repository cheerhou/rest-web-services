package com.cheerhou.rest.webservices.restfulwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author hcj
 * @Description
 * @Date 2020/12/14
 */
@RestController
public class FilteringController {
    @GetMapping("/filtering")
    public SomeBean retrieveSomeBean(){
        return new SomeBean("v1", "v2", "v3");
    }

    @GetMapping("/filtering-list")
    public List<SomeBean> retrieveListOfSomeBeans(){
        return Arrays.asList(new SomeBean("v1", "v2", "v3"), new SomeBean("v12", "v22", "v32"));
    }
}
