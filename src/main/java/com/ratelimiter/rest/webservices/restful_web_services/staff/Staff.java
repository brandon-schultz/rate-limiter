package com.ratelimiter.rest.webservices.restful_web_services.staff;

public abstract class Staff {
    private int id;
    private String firstName;
    private String lastName;

    public Staff(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
