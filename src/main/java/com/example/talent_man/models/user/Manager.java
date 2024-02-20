package com.example.talent_man.models.user;

import com.example.talent_man.models.PotentialAttribute;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Manager extends User{
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private Set<PotentialAttribute> potentialAttributeSet;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private Set<Employee> employees;

    public Manager(){}
    public Manager(String name,int roleId){
        super(name, roleId);
    }

    public Set<PotentialAttribute> getPotentialAttributeSet() {
        return potentialAttributeSet;
    }

    public void setPotentialAttributeSet(Set<PotentialAttribute> potentialAttributeSet) {
        this.potentialAttributeSet = potentialAttributeSet;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
