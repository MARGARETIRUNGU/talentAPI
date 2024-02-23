package com.example.talent_man.models;

import com.example.talent_man.models.composite_keys.UserAnswerKey;
import com.example.talent_man.models.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
public class UserQuestionAnswer implements Serializable {

    private int UserQuestionAnswer;

    @EmbeddedId
    private UserAnswerKey id;

    @ManyToOne()
    @MapsId(value = "choiceId")
    @JoinColumn(name = "choice_id")
    private Choice choice;

    @ManyToOne()
    @MapsId(value = "userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne()
    @MapsId(value = "assessmentQuestionId")
    @JoinColumn(name = "assessment_question_id")
    private AssessmentQuestion question;


//    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL) //We want the selected choice on retrieval
//    @JoinColumn(name = "choice_id", referencedColumnName = "choice_id")  // This means Foreign key will be created only in the Selected_answers table i.e. extra column 'choice_id' will be created in the table
//    private Choice choices;

}
