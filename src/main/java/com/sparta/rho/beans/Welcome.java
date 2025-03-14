package com.sparta.rho.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Welcome {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String nextScreen() {
        if (path == null) {
            return "signIn";
        }
        if (path.equals("1")) {
            return "register";
        } else {
            return "login";
        }
    }
}
