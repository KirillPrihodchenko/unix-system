package com.unix.unixsystem.service;

import com.unix.unixsystem.entity.User;
import com.unix.unixsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {

        return userRepository.save(user);
    }

    public List<User> getAll() {

        return userRepository.findAll();
    }
}