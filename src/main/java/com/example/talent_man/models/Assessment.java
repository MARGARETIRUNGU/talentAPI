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
public class Assessment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assessment_id", columnDefinition = "INTEGER")
    private int AssessmentId;
    @Column(name = "assessment_name", columnDefinition = "VARCHAR(255)")
    private String AssessmentName;
    @Column(name = "Assessment_question_description", columnDefinition = "VARCHAR(255)")
    private String AssessmentDescription;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "assessment_id")
    Set<AssessmentQuestion> assessmentQuestions;









//    @Column(name = "Assessment_question_score", columnDefinition = "INTEGER")
//    private int AssessmentQuestionScore;
//    @Column(name = "employee_assessment_question_score", columnDefinition = "INTEGER")
//    private int EmployeeAssessmentQuestionScore;
//    @Column(name = "employee_manager_assessment_question_score", columnDefinition = "INTEGER")
//    private int EmployeeManagerAssessmentQuestionScore;
}
