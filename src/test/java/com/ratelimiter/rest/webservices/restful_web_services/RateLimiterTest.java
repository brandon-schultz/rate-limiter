package com.ratelimiter.rest.webservices.restful_web_services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class RateLimiterTest {
    @Test
    void testRateLimiter() throws Exception {
        URL urlEmployee = new URL("http://localhost:8080/employees");
        URL urlManager = new URL("http://localhost:8080/managers");

        HttpURLConnection con = null;

        for( int i = 0 ;  i < 50 ; i++){
            int statusEmployee = callRequest(urlEmployee);
            int statusManager = callRequest(urlManager);

            System.out.print("\nStatus from Employee Request# - " + (i + 1) + " " + statusEmployee);
            if(statusEmployee == 429){
                System.out.print(" **********");
            }

            System.out.print("\nStatus from Manager Request# - " + (i + 1) + " " + statusManager);
            if(statusManager == 429){
                System.out.print(" **********");
            }

            System.out.print("\n");

            boolean anyValueEqualEmployee = statusEmployee == 429 || statusEmployee == 200 ? true : false;
            boolean anyValueEqualManager = statusManager == 429 || statusManager == 200 ? true : false;

            assertTrue(anyValueEqualEmployee, "Invalid response code from request");

            if(statusEmployee == 429 || statusManager == 429){
                Thread.sleep(4000);
            } else {
                Thread.sleep(500);
            }
        }
    }

    private int callRequest(URL url) throws Exception{
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        return con.getResponseCode();
    }
}
