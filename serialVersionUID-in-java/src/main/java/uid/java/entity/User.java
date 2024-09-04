package uid.java.entity;

import java.io.Serializable;

public class User  implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private transient String  password;
    private transient  String nationalCode;
    private double gpa;

    public User(String username, String password, String nationalCode, double gpa) {
        this.username = username;
        this.password = password;
        this.nationalCode = nationalCode;
        this.gpa = gpa;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
