package com.example.talent_man.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Table(name = "Assessment_questions")
@NoArgsConstructor
public class AssessmentQuestion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assessment_question_id", columnDefinition = "NUMBER")
    private int AssessmentQuestionId;
    @Column(name = "potential_attribute_id", columnDefinition = "NUMBER")
    private int potentialAttributeId;
    @Column(name = "Assessment_question_description", columnDefinition = "VARCHAR2(255)")
    private String AssessmentQuestionDescription;
    @Column(name = "Assessment_question_score", columnDefinition = "NUMBER")
    private int AssessmentQuestionScore;
    @Column(name = "employee_assessment_question_score", columnDefinition = "NUMBER")
    private int EmployeeAssessmentQuestionScore;
    @Column(name = "employee_manager_assessment_question_score", columnDefinition = "NUMBER")
    private int EmployeeManagerAssessmentQuestionScore;
}
