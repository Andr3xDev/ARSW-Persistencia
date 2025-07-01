package edu.arsw.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.arsw.persistence.models.User;

@Repository
public interface UserRepositoryJpa extends JpaRepository<User, String> {

}