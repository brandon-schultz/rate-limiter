package com.ratelimiter.rest.webservices.restful_web_services.user;

import com.ratelimiter.rest.webservices.restful_web_services.staff.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {
    private static List<Employee> employees = new ArrayList<>();

    static{
        employees.add( new Employee(1, "Brandon", "Schultz"));
        employees.add( new Employee(2, "John", "Smith"));
        employees.add( new Employee(3, "Peter", "Jones"));
    }

    public List<Employee> findAll(){
        return employees;
    }
}
