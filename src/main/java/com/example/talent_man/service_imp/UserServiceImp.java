package com.example.talent_man.service_imp;

import com.example.talent_man.models.user.User;
import com.example.talent_man.repos.UserRepo;
import com.example.talent_man.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepo repo;
    @Override
    public User addUser(User user) {
        return repo.save(user);
    }
}
