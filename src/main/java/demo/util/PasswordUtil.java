package demo.util;

public class PasswordUtil {

    public static boolean validatePassword(String password) {

        if(password == null)
            return false;

        // changed rule
        return password.length() > 8;

    }

}