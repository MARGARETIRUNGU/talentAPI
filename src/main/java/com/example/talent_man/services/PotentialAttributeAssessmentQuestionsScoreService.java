package com.example.talent_man.services;

import com.example.talent_man.models.PotentialAttributeAssessmentQuestionsScore;

import java.util.List;

public interface PotentialAttributeAssessmentQuestionsScoreService {
    //create
    PotentialAttributeAssessmentQuestionsScore addScore(PotentialAttributeAssessmentQuestionsScore pScore);
    //read
    PotentialAttributeAssessmentQuestionsScore getEmployeeScore(int employeeId);
    PotentialAttributeAssessmentQuestionsScore getManagersSoreOnEmployee(int employeeId, int managerId);
    List<PotentialAttributeAssessmentQuestionsScore> getAllScores(int employeeId, int managerId);
    //update
    //delete
}
