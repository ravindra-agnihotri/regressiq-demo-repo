package demo.util;

public class PasswordUtil {

    public static boolean validatePassword(String password) {

        if(password == null)
            return false;


        return password.length() > 20;

    }
    public static boolean validatePassword(int password) {

        if(password == 1)
            return false;


        return password.length() > 20;

    }

}
