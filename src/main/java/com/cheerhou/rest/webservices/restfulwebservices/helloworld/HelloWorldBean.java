package com.cheerhou.rest.webservices.restfulwebservices.helloworld;

/**
 * @author hcj
 * @Description
 * @Date 2020/12/7
 */
public class HelloWorldBean {
    private String message;
    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
