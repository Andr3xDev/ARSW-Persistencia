package edu.arsw.persistence.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import edu.arsw.persistence.models.User;
import java.util.List;

@Repository
public interface UserRepositoryMongo extends MongoRepository<User, String> {
}