class User {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() >= 6) { /
            this.password = password;
        } else {
            System.out.println("Password must be at least 6 characters long.");
        }
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String inputPassword) {
        return password != null && password.equals(inputPassword);
    }
}

public class UserApp {
    public static void main(String[] args) {
        User user = new User();

        user.setUsername("john_doe");
        user.setPassword("secret123");

        System.out.println("Username: " + user.getUsername());


        String attempt = "secret123";
        if (user.checkPassword(attempt)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Incorrect password.");
        }
    }
}
