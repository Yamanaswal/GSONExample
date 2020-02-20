package com.example.gsonexample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
    private String firstname;
    private int age;
    private String mail;
    //transient - for hide password.
    private transient String password;

    @SerializedName("address")
    private Address mAddress;

    @SerializedName("family")
    private List<FamilyMember> mfamily;

    public Employee(String firstname,int age, String mail, Address address,List<FamilyMember> family,String password) {
        this.firstname = firstname;
        this.age = age;
        this.mail = mail;
        this.mAddress = address;
        this.mfamily = family;
        this.password = password;
    }

/*
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
 */
}
