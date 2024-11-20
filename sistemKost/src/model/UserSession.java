package model;

public class UserSession {
    private static UserSession instance;
    private String currentUsername;
    private String userType; // "ADMIN" or "PELANGGAN"
    private boolean isLoggedIn;

    private UserSession() {
        isLoggedIn = false;
    }

    public static synchronized UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public void login(String username, String userType) {
        this.currentUsername = username;
        this.userType = userType;
        this.isLoggedIn = true;
    }

    public void logout() {
        this.currentUsername = null;
        this.userType = null;
        this.isLoggedIn = false;
    }

    public static String getCurrentUsername() {
        if (!getInstance().isLoggedIn) {
            throw new IllegalStateException("No user is currently logged in");
        }
        return getInstance().currentUsername;
    }

    public static String getUserType() {
        return getInstance().userType;
    }

    public static boolean isLoggedIn() {
        return getInstance().isLoggedIn;
    }
}