package com.example.talent_man.controllers;

import com.example.talent_man.models.PotentialAttribute;
import com.example.talent_man.models.user.Employee;
import com.example.talent_man.models.user.Manager;
import com.example.talent_man.models.user.User;
import com.example.talent_man.service_imp.UserServiceImp;
import com.example.talent_man.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
public class UserController {
    @Autowired
    private UserServiceImp service;
    @PostMapping("/addTopManager")
    public ApiResponse addUser(@RequestBody Manager user){
        try{
            if(user == null){
                return new ApiResponse(300, "User cannot be empty");
            }else if (user.getUserFullName() == null || user.getUserFullName().equals("")) {
                return new ApiResponse(300, "User name is required");
            }else if (user.getRoleId() != 1) {
                return new ApiResponse(300, "End point to be used to add manager without a manager");
            }else{
                Manager user1 = new Manager(user.getUserFullName(), user.getRoleId());
                User added = service.addUser(user1);
                return new ApiResponse(200, added.toString() + " successfully");
            }
        }catch (Exception e){
            return new ApiResponse(503, e.getMessage());
        }
    }

    @PostMapping("/addEmployee")
    public ApiResponse addEmployee(@RequestParam int managerId, @RequestBody Employee emp){
        try{
            //getting the employees manager
            Manager man =  service.getManagerById(managerId);

            if(managerId == 0){
                return new ApiResponse(300, "Enter a valid id");
            } else if (emp == null) {
                return new ApiResponse(300, "Enter employee details");

            } else if (emp.getUserFullName() == null || emp.getUserFullName().equals("")) {
                System.out.println(emp.getUserFullName());
                return new ApiResponse(300, "Enter employee name");
            } else if (emp.getRoleId() != 1 && emp.getRoleId() != 2) {
                return new ApiResponse(300, "Enter a valid user role");
            }else{

                //creating the employee instance
                Employee employee = new Employee(emp.getUserFullName(), emp.getRoleId());

                if(man.getEmployees().isEmpty()){
                    Set<Employee> employees = new HashSet<>();
                    employees.add(employee);
                    man.setEmployees(employees);
                }else{
                    man.getEmployees().add(employee);
                }
                User added = service.addUser(man);
                return new ApiResponse(200, "Dear "+ added.getUserFullName()+  ", " + employee.toString() + "added successfully.");

            }

        }catch (Exception e){
            return new ApiResponse(500, e.getMessage());
        }
    }
    
    @PostMapping("/addPotential")
    public ApiResponse addPotential(@RequestParam int managerId, @RequestBody PotentialAttribute attribute){
        try{
            if (managerId == 0){
                return new ApiResponse(300, "Please enter a valid id");
            } else if (attribute.getPotentialAttributeName() == null || attribute.getPotentialAttributeName().equals("")) {
                return new ApiResponse(300, "Attribute requires a name");
            } else if (attribute.getPotentialAttributeDescription() == null || attribute.getPotentialAttributeDescription().equals("")) {
                return new ApiResponse(300, "Attribute requires a description");
            }else{
                Manager manger = (Manager) service.getManagerById(managerId);

                if (manger.getPotentialAttributeSet() == null || manger.getPotentialAttributeSet().isEmpty()){
                    Set<PotentialAttribute> att = new HashSet<>();
                    att.add(attribute);
                    manger.setPotentialAttributeSet(att);
                }else{
                    manger.getPotentialAttributeSet().add(attribute);
                }
                Manager manager = (Manager) service.addUser(manger);
                return new ApiResponse(200, "Dear " + manager.getUserFullName() + ", " + attribute.toString() + " added successfully");

            }
        }catch (Exception e){
            return new ApiResponse(500, e.getMessage());
        }
    }
}
