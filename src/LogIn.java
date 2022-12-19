public class LogIn {
    private String user_email;
    private char[] user_password;

    public LogIn(String user_email, char[] user_password) {
        this.user_email = user_email;
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public char[] getUser_password() {
        return user_password;
    }

    public void setUser_password(char[] user_password) {
        this.user_password = user_password;
    }
}
