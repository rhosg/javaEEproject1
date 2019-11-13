package com.sparta.rho.beans;

import com.sparta.rho.components.User;
import com.sparta.rho.services.LoginService;
import com.sparta.rho.services.RegistrationService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped

public class UserBean {
    @Inject
    private RegistrationService registrationService;
    @Inject
    private LoginService loginService;
    private User user= new User();


    public User getUser() {
        return user;
    }

    public String registerUser(){
        return registrationService.registerUser(user);
    }

    public String validateUser() {
        return loginService.validateUser(user);
    }
}
