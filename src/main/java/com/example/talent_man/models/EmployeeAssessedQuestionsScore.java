package com.example.talent_man.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@Entity
@Table(name = "employee_assessed_questions")
@NoArgsConstructor
public class EmployeeAssessedQuestionsScore implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;



}
