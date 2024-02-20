package com.example.talent_man.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "assessment_questions")
@NoArgsConstructor
public class AssessmentQuestion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assessment_question_id", columnDefinition = "INTEGER")
    private int assessmentQuestionId;

    @Column(name = "assessment_question_description", columnDefinition = "INTEGER")
    private String assessmentQuestionDescription;


    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "assessment_question_id")
    Set<Choice> choices;

    @OneToMany(mappedBy = "question", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    Set<UserQuestionAnswer> selectedAnswers;



}
