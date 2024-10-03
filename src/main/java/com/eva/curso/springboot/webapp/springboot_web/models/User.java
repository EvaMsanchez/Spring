package com.eva.curso.springboot.webapp.springboot_web.models;

public class User 
{
    private String name;
    private String lastname;

    // Constructor
    public User(String name, String lastname) 
    {
        this.name = name;
        this.lastname = lastname;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
}
