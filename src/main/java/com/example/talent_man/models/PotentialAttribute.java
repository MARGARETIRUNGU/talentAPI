package com.example.talent_man.models;

import com.example.talent_man.models.user.Manager;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "potential_attributes")
@NoArgsConstructor
public class PotentialAttribute implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "potential_attribute_id", columnDefinition = "INTEGER")
    private int potentialAttributeId;

    @Column(name = "potential_attribute_name", columnDefinition = "VARCHAR(255)")
    private String potentialAttributeName;
    @Column(name = "potential_attribute_description", columnDefinition = "TEXT")
    private String potentialAttributeDescription;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "potential_attribute_id")
    Set<Assessment> assessments;
}
