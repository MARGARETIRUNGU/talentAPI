package com.example.talent_man.models.user;

import com.example.talent_man.models.PotentialAttribute;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
public class Manager extends User{
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    public Set<PotentialAttribute> potentialAttributeSet;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    public Set<Employee> employees;

    public Manager(String name,int roleId){
        super(name, roleId);
    }
}
