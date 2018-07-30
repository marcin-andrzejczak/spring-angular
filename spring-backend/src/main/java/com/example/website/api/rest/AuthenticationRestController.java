package com.example.website.api.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class AuthenticationRestController {

    @RequestMapping("/user")
    public Principal user(Principal user){
        return user;
    }

}
