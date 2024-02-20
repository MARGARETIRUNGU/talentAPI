package com.example.talent_man.services;

import com.example.talent_man.models.Assessment;

import java.util.List;

public interface AssessmentQuestionService {
    //create
    Assessment addAssessmentQuestion(Assessment assQuestion);
    //read
    Assessment getAssessmentQuestionById(int id);
    List<Assessment> getAssessmentAllQuestions();
    //update
    Assessment updateAssessmentQuestion(int id, Assessment assQuestion);
    //delete
}
