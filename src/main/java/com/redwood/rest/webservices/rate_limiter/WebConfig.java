package com.redwood.rest.webservices.rate_limiter;

import com.redwood.rest.webservices.rate_limiter.interceptor.EmployeeRequestInterceptor;
import com.redwood.rest.webservices.rate_limiter.interceptor.ManagerRequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private EmployeeRequestInterceptor employeeRequestInterceptor;

    @Autowired
    private ManagerRequestInterceptor managerRequestInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(employeeRequestInterceptor)
                .addPathPatterns("/employees");

        registry.addInterceptor(managerRequestInterceptor)
                .addPathPatterns("/managers");
    }
}
