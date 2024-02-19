package com.example.talent_man.controllers;

import com.example.talent_man.models.PotentialAttribute;
import com.example.talent_man.repos.PotentialAttributeRepo;
import com.example.talent_man.service_imp.PotentialAttributeServiceImp;
import com.example.talent_man.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PotentialAttributesController {
    @Autowired
    private PotentialAttributeServiceImp service;

    @GetMapping("/addAttribute")
    public ApiResponse addAttribute(){
        PotentialAttribute att = new PotentialAttribute();
        att.setPotentialAttributeName("Aspiration");
        try{
            PotentialAttribute attribute = service.addPotentialAttribute(att);
            return new ApiResponse(200, attribute.toString());
        }catch (Exception e){
            return new ApiResponse(403, e.getMessage());
        }
    }
}
