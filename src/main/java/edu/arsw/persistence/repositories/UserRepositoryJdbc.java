package edu.arsw.persistence.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import edu.arsw.persistence.models.User;

@Repository
public interface UserRepositoryJdbc {

    User save(User user);

    Optional<User> findById(String id);

    List<User> findAll();

}