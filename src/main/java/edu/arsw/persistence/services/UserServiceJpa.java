package edu.arsw.persistence.services;

import java.util.List;
import org.springframework.stereotype.Service;
import edu.arsw.persistence.models.User;
import edu.arsw.persistence.repositories.UserRepositoryJpa;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceJpa {

    private final UserRepositoryJpa userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}