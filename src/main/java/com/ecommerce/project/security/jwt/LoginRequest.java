package com.ecommerce.project.security.jwt;

/*
Purpose: Model for login request payload.
Contains username and password.
Used when clients (frontend/postman) send login credentials to your API.
*/

public class LoginRequest {
    private String username;

    private String password;

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
}
