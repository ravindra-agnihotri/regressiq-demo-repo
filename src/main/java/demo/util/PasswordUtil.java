package demo.util;

public class PasswordUtil {

    public static boolean validatePassword(String password) {

        if(password == null)
            return false;


        return password.length() > 20;

    }

}