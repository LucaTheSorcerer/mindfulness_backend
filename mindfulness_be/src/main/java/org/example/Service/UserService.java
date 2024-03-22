package org.example.Service;


import org.example.Entities.User;
import org.example.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(long userId) {
        return userRepository.findById(userId).orElseThrow(() ->  new RuntimeException("User not found!"));
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User deleteUser(long userId) {
        User existingUser = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found!"));
        userRepository.deleteById(userId);
        return existingUser;
    }

    public List<User> getUsersByName(String userName) {
        return userRepository.getUserByName(userName);
    }
}
