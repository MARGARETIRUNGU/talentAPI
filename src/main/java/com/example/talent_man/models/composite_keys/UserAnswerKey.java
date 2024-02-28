package com.example.talent_man.models.composite_keys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;
@Data
@Embeddable //creating a composite key
public class UserAnswerKey implements Serializable {
    @Column(name = "user_id")
    private int userId;

    @Column(name = "choice_id")
    private int choiceId;
    @Column(name = "assessment_question_id")
    private int assessmentQuestionId;
}
