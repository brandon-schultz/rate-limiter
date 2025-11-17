package com.ratelimiter.rest.webservices.restful_web_services.ratelimiter;

public class EmployeeRequestRateLimiter extends RateLimiter{

    public EmployeeRequestRateLimiter(long capacity, long refillRate) {
        super(capacity, refillRate, "Employee Rate Limiter");
    }
}
