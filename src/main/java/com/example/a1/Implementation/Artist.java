package com.example.a1.Implementation;

import java.io.Serializable;

public class Artist implements Serializable {

    private String nickname;
    private String fName;
    private String lName;
    private String bio;

    public Artist() {
        this.nickname = null;
        this.fName = null;
        this.lName = null;
        this.bio = null;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
