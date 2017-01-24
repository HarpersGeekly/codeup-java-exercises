package TestOOP;

/**
 * Created by RyanHarper on 1/6/17.
 */
public class User {
    String username;
    String password;
    String email;
    boolean isAdmin;
    boolean isLoggedIn;

    public void login(String attemptedUsername, String attemptedPassword) {
        if(username.equals(attemptedUsername) && password.equals(attemptedPassword)) {
            isLoggedIn = true;
            // log in the user
        }
    }
    public void changePassword(String newPassword) {
        password = newPassword;
    }
}
