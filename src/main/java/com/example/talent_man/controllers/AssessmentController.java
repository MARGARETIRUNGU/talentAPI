package com.example.talent_man.controllers;

import com.example.talent_man.models.Assessment;
import com.example.talent_man.models.AssessmentQuestion;
import com.example.talent_man.services.AssessmentService;
import com.example.talent_man.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
public class AssessmentController {
    @Autowired
    private AssessmentService service;

    @PostMapping("/addQuestion")
    public ApiResponse addQuestion(@RequestParam int assId, @RequestBody AssessmentQuestion assQuestion){
        try{
            if(assId == 0){
                return new ApiResponse(300, "Enter a valid assignment Id");
            }else if(assQuestion.getAssessmentQuestionDescription() == null || assQuestion.getAssessmentQuestionDescription().equals("")){
                return new ApiResponse(300, "Please enter question description");
            }else{
                Assessment ass = service.getById(assId);

                if(ass.getAssessmentQuestions() == null || ass.getAssessmentQuestions().isEmpty()){
                    Set<AssessmentQuestion> questions = new HashSet<>();
                    questions.add(assQuestion);
                    ass.setAssessmentQuestions(questions);
                }else{
                    ass.getAssessmentQuestions().add(assQuestion);
                }

                Assessment one = service.addAss(ass);
                return new ApiResponse(200, one.toString() + "success");

            }
        }catch (Exception e){
            return new ApiResponse(200, e.getMessage());

        }
    }
}
