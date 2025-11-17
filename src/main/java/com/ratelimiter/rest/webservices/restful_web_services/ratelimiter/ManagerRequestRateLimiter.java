package com.ratelimiter.rest.webservices.restful_web_services.ratelimiter;

public class ManagerRequestRateLimiter extends RateLimiter{
    public ManagerRequestRateLimiter(long capacity, long refillRate) {
        super(capacity, refillRate, "Manager Rate Limiter");
    }
}
