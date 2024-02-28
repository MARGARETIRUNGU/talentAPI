package com.example.talent_man.controllers;

import com.example.talent_man.models.Assessment;
import com.example.talent_man.models.PotentialAttribute;
import com.example.talent_man.repos.PotentialAttributeRepo;
import com.example.talent_man.service_imp.PotentialAttributeServiceImp;
import com.example.talent_man.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
public class PotentialAttributesController {
    @Autowired
    private PotentialAttributeServiceImp service;

    @PostMapping(value = "/addAssessments", consumes = "application/json")
    public ApiResponse addAssessment(@RequestParam int attributeId, @RequestBody Assessment ass){

        try{
            if(attributeId == 0){
                return new ApiResponse(300, "Enter a valid id");
            }else if(ass.getAssessmentName() == null || ass.getAssessmentName().equals("")){
                return new ApiResponse(300, "Assessment should have a name");
            }else if(ass.getAssessmentDescription() == null || ass.getAssessmentDescription().equals("") ){
                return new ApiResponse(300, "Please tell us more about the assessment, what to expect and what is required");
            }else{
                PotentialAttribute attribute = service.getPotentialAttributeById(attributeId);
                if(attribute.getAssessments() == null || attribute.getAssessments().isEmpty()){
                    Set<Assessment> assess = new HashSet<>();
                    assess.add(ass);
                    attribute.setAssessments(assess);
                }else{
                    attribute.getAssessments().add(ass);
                }
                PotentialAttribute att = service.addPotentialAttribute(attribute);
                return new ApiResponse(200, att.toString() + " successfully");
            }

        }catch (Exception e){
            return new ApiResponse(403, e.getMessage());
        }
    }
}
