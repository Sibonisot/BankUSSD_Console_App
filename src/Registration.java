public class Registration {
    private String userID_r ;
    private String name_r;
    private String surname_r;
    private char[] password_r;
    private String email_r;
    private long phoneNumber_r;

    Registration(String userID_r, String name_r, String surname_r, char [] password,
                 String email_r, long phoneNumber_r){
        this.userID_r = userID_r;
        this.name_r = name_r;
        this.surname_r = surname_r;
        this.password_r = password;
        this.email_r = email_r;
        this.phoneNumber_r = phoneNumber_r;
    }

    public String getUserID_r() {
        return userID_r;
    }

    public void setUserID_r(String userID_r) {
        this.userID_r = userID_r;
    }

    public String getName_r() {
        return name_r;
    }

    public void setName_r(String name_r) {
        this.name_r = name_r;
    }

    public String getSurname_r() {
        return surname_r;
    }

    public void setSurname_r(String surname_r) {
        this.surname_r = surname_r;
    }

    public char[] getPassword_r() {
        return password_r;
    }

    public void setPassword_r(String password_r) {
        this.password_r = password_r.toCharArray();
    }

    public String getEmail_r() {
        return email_r;
    }

    public void setEmail_r(String email_r) {
        this.email_r = email_r;
    }

    public long getPhoneNumber_r() {
        return phoneNumber_r;
    }

    public void setPhoneNumber_r(long phoneNumber_r) {
        this.phoneNumber_r = phoneNumber_r;
    }
}
