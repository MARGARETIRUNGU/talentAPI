package com.example.talent_man.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Table(name = "assessment_questions")
@NoArgsConstructor
public class AssessmentQuestion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assessment_question_id", columnDefinition = "INTEGER")
    private int AssessmentQuestionId;
    @Column(name = "potential_attribute_id", columnDefinition = "INTEGER")
    private int potentialAttributeId;
    @Column(name = "Assessment_question_description", columnDefinition = "VARCHAR(255)")
    private String AssessmentQuestionDescription;
    @Column(name = "Assessment_question_score", columnDefinition = "INTEGER")
    private int AssessmentQuestionScore;
    @Column(name = "employee_assessment_question_score", columnDefinition = "INTEGER")
    private int EmployeeAssessmentQuestionScore;
    @Column(name = "employee_manager_assessment_question_score", columnDefinition = "INTEGER")
    private int EmployeeManagerAssessmentQuestionScore;
}
