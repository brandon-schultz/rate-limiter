package com.ratelimiter.rest.webservices.restful_web_services.ratelimiter;

public class RateLimiteRepo {
    public static EmployeeRequestRateLimiter rateLimiterEmployee = new EmployeeRequestRateLimiter(10, 1);
    public static ManagerRequestRateLimiter rateLimiterManager = new ManagerRequestRateLimiter(15, 1);
}
