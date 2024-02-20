package com.example.talent_man.repos.user;

import com.example.talent_man.models.user.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Manager, Integer> {
}
