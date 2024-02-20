package com.example.talent_man.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable //creating a composite key
public class UserAnswerKey implements Serializable {
    @Column(name = "user_id")
    private int userId;

    @Column(name = "choice_id")
    private int choiceId;
    @Column(name = "assessment_question_id")
    private int assessmentQuestionId;
}
