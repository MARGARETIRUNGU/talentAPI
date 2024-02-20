package com.example.talent_man.service_imp;

import com.example.talent_man.models.Assessment;
import com.example.talent_man.repos.AssessmentRepo;
import com.example.talent_man.services.AssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssessmentServiceImp implements AssessmentService {
    @Autowired
    private AssessmentRepo repo;
    @Override
    public Assessment addAss(Assessment ass) {
        return repo.save(ass);
    }

    @Override
    public Assessment getById(int id) {
        return repo.getReferenceById(id);
    }
}
