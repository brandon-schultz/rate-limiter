package com.redwood.rest.webservices.rate_limiter.user;

import com.redwood.rest.webservices.rate_limiter.staff.Employee;
import com.redwood.rest.webservices.rate_limiter.staff.Manager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaffResource {
    private EmployeeService employeeService;
    private ManagerService managerService;

    public StaffResource(EmployeeService employeeService, ManagerService managerService) {
        this.employeeService = employeeService;
        this.managerService = managerService;
    }

    @GetMapping(path = "/employees")
    public List<Employee> getEmployees(){
        return employeeService.findAll();
    }

    @GetMapping(path = "/managers")
    public List<Manager> getManagers(){
        return managerService.findAll();
    }
}
