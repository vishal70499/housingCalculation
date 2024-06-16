package com.cipla.amstechconstructionadvance;

public class User {

    private String userName;
    private String gender;

    public User(String userName, String gender) {
        this.userName = userName;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
