package com.example.talent_man.service_imp;

import com.example.talent_man.models.Assessment;
import com.example.talent_man.repos.AssessmentQuestionsRepo;
import com.example.talent_man.services.AssessmentQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentQuestionServiceImp implements AssessmentQuestionService {
    @Autowired
    private AssessmentQuestionsRepo repo;
    @Override
    public Assessment addAssessmentQuestion(Assessment assQuestion) {
        return repo.save(assQuestion);
    }

    @Override
    public Assessment getAssessmentQuestionById(int id) {
        return repo.getReferenceById(id);
    }

    @Override
    public List<Assessment> getAssessmentAllQuestions() {
        return null;
    }

    @Override
    public Assessment updateAssessmentQuestion(int id, Assessment assQuestion) {
        return null;
    }
}
