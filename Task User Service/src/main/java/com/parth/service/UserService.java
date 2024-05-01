package com.parth.service;

import com.parth.model.User;

import java.util.List;

public interface UserService {

    User getUserProfile(String jwt);

    List<User> getAllUser();
}
