package com.ratelimiter.rest.webservices.restful_web_services.user;

import com.ratelimiter.rest.webservices.restful_web_services.staff.Manager;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ManagerService {
    private static List<Manager> managers = new ArrayList<>();

    static{
        managers.add(new Manager(1, "Sarah", "James"));
        managers.add(new Manager(2, "Jason", "Crow"));
        managers.add(new Manager(3, "Jimmy", "Hoffa"));
    }

    public List<Manager> findAll(){
        return managers;
    }
}
