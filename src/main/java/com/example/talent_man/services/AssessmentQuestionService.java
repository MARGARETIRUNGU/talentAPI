package com.example.talent_man.services;

import com.example.talent_man.models.AssessmentQuestion;

import java.util.List;

public interface AssessmentQuestionService {
    //create
    AssessmentQuestion addAssessmentQuestion(AssessmentQuestion assQuestion);
    //read
    AssessmentQuestion getAssessmentQuestionById(int id);
    List<AssessmentQuestion> getAssessmentAllQuestions();
    //update
    AssessmentQuestion updateAssessmentQuestion(int id, AssessmentQuestion assQuestion);
    //delete
}
