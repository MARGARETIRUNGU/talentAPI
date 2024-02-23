package com.example.talent_man.service_imp;

import com.example.talent_man.models.UserQuestionAnswer;
import com.example.talent_man.repos.UserQuestionAnswerRepo;
import com.example.talent_man.services.UserQuestionAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserQuestionAnswerImp implements UserQuestionAnswerService {
    @Autowired
    private UserQuestionAnswerRepo repo;

    @Override
    public UserQuestionAnswer addUserAnswer(UserQuestionAnswer ans) {
        return repo.save(ans);
    }
}
