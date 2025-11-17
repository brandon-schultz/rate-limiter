package com.redwood.rest.webservices.rate_limiter.ratelimiter;

public class EmployeeRequestRateLimiter extends RateLimiter{

    public EmployeeRequestRateLimiter(long capacity, long refillRate) {
        super(capacity, refillRate, "Employee Rate Limiter");
    }
}
