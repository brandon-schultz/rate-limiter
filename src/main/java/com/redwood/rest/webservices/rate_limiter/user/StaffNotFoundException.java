package com.redwood.rest.webservices.rate_limiter.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.TOO_MANY_REQUESTS)
public class StaffNotFoundException extends RuntimeException{
    public StaffNotFoundException(String message){
        super(message);
    }
}
