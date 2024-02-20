package com.example.talent_man.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "choices")
@NoArgsConstructor
public class Choice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "choice_id", columnDefinition = "INTEGER")
    private int choice_id;

    @Column(name = "choice_description", columnDefinition = "VARCHAR(255)")
    private String choiceDescription;
    @Column(name = "choice_value", columnDefinition = "INTEGER")
    private int choiceValue;

    @OneToMany(mappedBy = "choice")
    Set<UserQuestionAnswer> userAnswers;


}
