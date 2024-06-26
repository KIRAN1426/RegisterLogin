package com.example.RegisterLogin.Entity;

public class LoginDTO {

    private String email;
    private String password;

    public LoginDTO(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public LoginDTO() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}



