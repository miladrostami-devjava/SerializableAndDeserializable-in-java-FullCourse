package com.tr.entity;

import java.io.Serializable;

public class User  implements Serializable {
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
