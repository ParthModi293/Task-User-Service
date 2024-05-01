package com.parth.serviceImpl;

import com.parth.config.JwtProvider;
import com.parth.model.User;
import com.parth.repository.UserRepository;
import com.parth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserProfile(String jwt) {

        String email = JwtProvider.getEmailFromJwtToken(jwt);
        return userRepository.findByEmail(email);

    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
