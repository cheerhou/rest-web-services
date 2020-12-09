package com.cheerhou.rest.webservices.restfulwebservices.expection;

import java.util.Date;

/**
 * @author hcj
 * @Description use to hold all the exception response
 * @Date 2020/12/9
 */
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
