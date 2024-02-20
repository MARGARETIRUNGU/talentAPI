package com.example.talent_man.repos;

import com.example.talent_man.models.Assessment;
import com.example.talent_man.models.UserQuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssessmentRepo extends JpaRepository<Assessment, Integer> {
}
