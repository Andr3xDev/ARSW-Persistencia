package edu.arsw.persistence.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.arsw.persistence.models.User;
import edu.arsw.persistence.services.UserServiceMongo;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/mongo/users")
@RequiredArgsConstructor
public class UserControllerMongo {
    private final UserServiceMongo userServiceMongo;

    @GetMapping
    public List<User> getAll() {
        return userServiceMongo.getAllUsers();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userServiceMongo.createUser(user);
    }
}