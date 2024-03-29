package com.appsdeveloperblog.tutorials.junit.ui.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//properties = {"server.port=8081","hostname=192.168.0.2"})
@TestPropertySource(locations = "/application-test.properties")
public class UsersControllerIntegrationTest {
    @Value("${server.port}")
    private int serverPort;

    @Test
    void contextLoads() {
        System.out.println("serer port: "+serverPort);

    }
}
