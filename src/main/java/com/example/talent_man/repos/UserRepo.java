package com.example.talent_man.repos;

import com.example.talent_man.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
