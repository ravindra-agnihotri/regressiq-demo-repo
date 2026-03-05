package demo.test;

import demo.controller.LoginController;

public class LoginTest {

    public static void main(String[] args) {

        LoginController controller = new LoginController();

        boolean result = controller.loginUser("admin","admin123");

        System.out.println(result);

    }

}
