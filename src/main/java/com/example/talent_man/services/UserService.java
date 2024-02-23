package com.example.talent_man.services;

import com.example.talent_man.models.user.Manager;
import com.example.talent_man.models.user.User;

public interface UserService {
    //Create
    Manager addUser(Manager user);
    //Read
    Manager getManagerById(int id);

    User getUserById(int id);
}
