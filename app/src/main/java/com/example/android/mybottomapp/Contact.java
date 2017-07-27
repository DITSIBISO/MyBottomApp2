package com.example.android.mybottomapp;

/**
 * Created by eKasiLab Alex CDTB on 2017/07/24.
 */

public class Contact {

    private String name,surname,email;

    public Contact(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }


    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


