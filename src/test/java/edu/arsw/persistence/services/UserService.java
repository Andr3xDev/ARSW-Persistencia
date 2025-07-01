package edu.arsw.persistence.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.arsw.persistence.models.User;
import edu.arsw.persistence.repositories.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

    private UserRepository userRepository;

    User creatUser(User user) {
        return null;
    }

    List<User> getAllUsers() {
        return null;
    }

}