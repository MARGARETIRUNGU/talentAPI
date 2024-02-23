package com.example.talent_man.repos;

import com.example.talent_man.models.UserQuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserQuestionAnswerRepo extends JpaRepository<UserQuestionAnswer, Integer> {
}
