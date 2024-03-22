package org.example.Repositories;

import org.example.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM users where username = ?1", nativeQuery = true)
    List<User> getUserByName(String username);
}
