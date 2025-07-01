package edu.arsw.persistence.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.arsw.persistence.models.User;
import edu.arsw.persistence.services.UserServiceJpa;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/jpa/users")
@RequiredArgsConstructor
public class UserControllerJpa {

    private UserServiceJpa userServiceJpa;

    @GetMapping
    public List<User> getAll() {
        return userServiceJpa.getAllUsers();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userServiceJpa.createUser(user);
    }

}