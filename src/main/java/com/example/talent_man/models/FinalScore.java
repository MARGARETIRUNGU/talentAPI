package com.example.talent_man.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "final_score")
@NoArgsConstructor
public class FinalScore implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "final_score_id", columnDefinition = "INTEGER")
    private int FinalScoreId;
    @Column(name = "employee_assessment_questions_average_score", columnDefinition = "FLOAT")
    private int FinalAverageScore;
    @Column(name = "manager_assessment_questions_average_score", columnDefinition = "FLOAT")
    private int managerAssessmentQuestionsAverageScore;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "assessment_question_id")
    private Set<AssessmentQuestion> assessmentQuestionsList;

}
