package com.example.a02_15055591_nguyenminhtuanh;

public class Users {
    String name,email,password;
    int happy,normal,sad;

    public Users() {
    }

    public Users(String name, String email, String password, int happy, int normal, int sad) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.happy = happy;
        this.normal = normal;
        this.sad = sad;
    }

    public Users(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHappy() {
        return happy;
    }

    public void setHappy(int happy) {
        this.happy = happy;
    }

    public int getNormal() {
        return normal;
    }

    public void setNormal(int normal) {
        this.normal = normal;
    }

    public int getSad() {
        return sad;
    }

    public void setSad(int sad) {
        this.sad = sad;
    }
}
