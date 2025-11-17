package com.ratelimiter.rest.webservices.restful_web_services.interceptor;

import com.ratelimiter.rest.webservices.restful_web_services.ratelimiter.RateLimiteRepo;
import com.ratelimiter.rest.webservices.restful_web_services.user.StaffNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class EmployeeRequestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(!RateLimiteRepo.rateLimiterEmployee.allowRequest()){
            throw new StaffNotFoundException("Too many requests");
        }

        return true;
    }
}
