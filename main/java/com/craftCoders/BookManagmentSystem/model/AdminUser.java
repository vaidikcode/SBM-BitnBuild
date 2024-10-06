package com.craftCoders.BookManagmentSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AdminUser {

    @Id
    public String email;
    public String password;
    public String name;
    public String about;
}
