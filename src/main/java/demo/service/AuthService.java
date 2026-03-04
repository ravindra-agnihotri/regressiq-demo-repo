package demo.service;

import demo.util.PasswordUtil;

public class AuthService {

    public boolean login(String username, String password){

        if(!PasswordUtil.validatePassword(password))
            return false;

        if(username.equals("admin") && password.equals("admin123"))
            return true;

        return false;
    }

}
