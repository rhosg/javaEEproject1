package com.sparta.rho.services;

import com.sparta.rho.components.User;

import javax.ejb.Stateless;
import javax.inject.Named;

@Named
@Stateless


public class RegistrationService {
    public String registerUser(User user) {
        if (user.getUserName().equals("rich20")|| user.getPassword().equals("")
        ||user.getUserName().equals("") || user.getFirstName().equals("")
                || user.getSurname().equals("")){
            return "register";
        } else {
            return "newUserRegistered";
        }

    }
}
