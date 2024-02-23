package com.example.talent_man.controllers;

import com.example.talent_man.models.AssessmentQuestion;
import com.example.talent_man.models.UserQuestionAnswer;
import com.example.talent_man.models.user.User;
import com.example.talent_man.services.AssessmentQuestionService;
import com.example.talent_man.services.UserQuestionAnswerService;
import com.example.talent_man.services.UserService;
import com.example.talent_man.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserQuestionAnswerController  {
    @Autowired
    private UserService uService;

    @Autowired
    private UserQuestionAnswerService qService;

    @Autowired
    private AssessmentQuestionService assQService;
    @PostMapping("/addAnswer")
    public ApiResponse addQuestionAnswer(int userId, int questionId, UserQuestionAnswer ans){
        try{
            if(userId == 0){
                return  new ApiResponse(301, "Enter a valid user id");
            }else if(questionId == 0){
                return  new ApiResponse(301, "Enter a valid question id");
            }else if(ans.getChoice() == null){
                return  new ApiResponse(301, "answer cannot be empty");
            }else{
                AssessmentQuestion question = assQService.getAssessmentQuestionById(questionId);
                User user = uService.getUserById(userId);
                ans.setUser(user);
                ans.setQuestion(question);
                return new ApiResponse(200, ans.toString());

            }
        }catch (Exception e){
            return new ApiResponse(500, e.getMessage());
        }
    }
}
