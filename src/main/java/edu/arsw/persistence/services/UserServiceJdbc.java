package edu.arsw.persistence.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import edu.arsw.persistence.models.User;
import edu.arsw.persistence.repositories.UserRepositoryJdbc;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceJdbc {
    private final UserRepositoryJdbc userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

}