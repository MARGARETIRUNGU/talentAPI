package com.example.talent_man.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@Entity
@Table(name = "potential_attributes")
@NoArgsConstructor
public class PotentialAttribute implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "potential_attribute_id")
    private int potentialAttributeId;
    @Column(name = "potential_attribute_name", columnDefinition = "VARCHAR2(255)")
    private String potentialAttributeName;
    @Column(name = "potential_attribute_description", columnDefinition = "TEXT")
    private String potentialAttributeDescription;
}
