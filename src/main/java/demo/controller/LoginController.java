package demo.controller;

import demo.service.AuthService;

public class LoginController {

    private AuthService authService = new AuthService();

    public boolean loginUser(String user, String pass){

        return authService.login(user, pass);

    }

}