package com.example.talent_man.controllers;

import com.example.talent_man.models.PotentialAttribute;
import com.example.talent_man.models.user.Employee;
import com.example.talent_man.models.user.Manager;
import com.example.talent_man.models.user.User;
import com.example.talent_man.service_imp.UserServiceImp;
import com.example.talent_man.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class UserController {
    @Autowired
    private UserServiceImp service;
    @GetMapping("/addUser")
    public ApiResponse addUser(){
        try{
            Manager user = new Manager("Joe Blogs", 1);
            PotentialAttribute att = new PotentialAttribute();
            att.setPotentialAttributeName("Aspiration");
            if(user.potentialAttributeSet == null){
                Set<PotentialAttribute> pAtt = new HashSet<>();
                pAtt.add(att);
                user.potentialAttributeSet = pAtt;

            }else{
                user.potentialAttributeSet.add(att);
            }
            Employee emp = new Employee("Charles James", 2);

            if(user.employees == null){
                Set<Employee> pAtt = new HashSet<>();
                pAtt.add(emp);
                user.employees = pAtt;

            }else{
                user.employees.add(emp);
            }

            if(user == null){
                return new ApiResponse(300, "User cannot be empty");
            }else{
                User added = service.addUser(user);
                return new ApiResponse(200, added.toString());
            }
        }catch (Exception e){
            return new ApiResponse(403, e.getMessage());
        }
    }
}
