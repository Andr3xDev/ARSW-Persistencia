package edu.arsw.persistence.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.arsw.persistence.models.User;
import edu.arsw.persistence.services.UserServiceJdbc;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/jdbc/users")
@RequiredArgsConstructor
public class UserControllerJdbc {

    private UserServiceJdbc userServiceJdbc;

    @GetMapping
    public List<User> getAll() {
        return userServiceJdbc.getAllUsers();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userServiceJdbc.createUser(user);
    }

}