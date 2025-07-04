package edu.arsw.persistence.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.arsw.persistence.models.User;
import edu.arsw.persistence.repositories.UserRepositoryMongo;

@Service
public class UserServiceMongo {

    @Autowired
    private UserRepositoryMongo userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

}