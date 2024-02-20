package com.example.talent_man.services;

import com.example.talent_man.models.Assessment;

public interface AssessmentService {
    //create
    Assessment addAss(Assessment ass);

    //Read
    Assessment getById(int id);
}
