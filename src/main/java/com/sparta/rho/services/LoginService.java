package com.sparta.rho.services;

import com.sparta.rho.components.User;

public class LoginService {
    public String validateUser(User user) {
        if (user.getUserName().equals("rich20") && user.getPassword().equals("password123")){
            return "welcome";
        } else {
            return "login";
        }
    }
}
