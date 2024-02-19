package com.example.talent_man.services;

import com.example.talent_man.models.FinalScore;

import java.util.List;

public interface PotentialAttributeAssessmentQuestionsScoreService {
    //create
    FinalScore addScore(FinalScore pScore);
    //read
    FinalScore getEmployeeScore(int employeeId);
    FinalScore getManagersSoreOnEmployee(int employeeId, int managerId);
    List<FinalScore> getAllScores(int employeeId, int managerId);
    //update
    //delete
}
