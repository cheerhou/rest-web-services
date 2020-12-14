package com.cheerhou.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author hcj
 * @Description
 * @Date 2020/12/14
 */
public class SomeBean {
    private String field1;
    private String field2;

    //this field will be completed ignored
    @JsonIgnore
    private String field3;

    public SomeBean(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }
}
