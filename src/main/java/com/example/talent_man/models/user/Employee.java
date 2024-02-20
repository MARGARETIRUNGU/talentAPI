package com.example.talent_man.models.user;

import jakarta.persistence.Entity;

@Entity
public class Employee extends User{
    public Employee(){}
    public Employee(String name, int roleId){
        super(name, roleId);
    }

}
