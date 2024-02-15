package com.example.talent_man.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "Potential_attribute_assessment_questions_score")
@NoArgsConstructor
public class PotentialAttributeAssessmentQuestionsScore implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "potential_attribute_assessment_questions_score_id", columnDefinition = "VARCHAR2(255)")
    private int PotentialAttributeAssessmentQuestionScoreId;
    @Column(name = "employee_assessment_questions_average_score", columnDefinition = "NUMBER")
    private int employeeAssessmentQuestionsAverageScore;
    @Column(name = "manager_assessment_questions_average_score", columnDefinition = "NUMBER")
    private int managerAssessmentQuestionsAverageScore;

    @OneToMany(mappedBy = "assessment_question_id")
    private List<AssessmentQuestion> assessmentQuestionsList;

}
