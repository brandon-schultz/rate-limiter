package com.redwood.rest.webservices.rate_limiter.ratelimiter;

public class ManagerRequestRateLimiter extends RateLimiter{
    public ManagerRequestRateLimiter(long capacity, long refillRate) {
        super(capacity, refillRate, "Manager Rate Limiter");
    }
}
