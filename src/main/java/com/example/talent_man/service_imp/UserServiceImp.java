package com.example.talent_man.service_imp;

import com.example.talent_man.models.user.Manager;
import com.example.talent_man.models.user.User;
import com.example.talent_man.repos.user.UserRepo;
import com.example.talent_man.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepo repo;
    @Override
    public Manager addUser(Manager user) {
        return repo.save(user);
    }

    @Override
    public Manager getManagerById(int id) {
        return repo.getReferenceById(id);
    }

    @Override
    public User getUserById(int id) {
        return repo.getReferenceById(id);
    }
}
