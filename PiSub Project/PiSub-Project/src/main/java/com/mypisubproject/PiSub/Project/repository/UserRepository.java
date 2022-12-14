package com.mypisubproject.PiSub.Project.repository;

import com.mypisubproject.PiSub.Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    public boolean existsByEmail(String email);
    public boolean existsByUniqueName(String uniqueName);
    public User findByEmail(String email);
    Optional<User> findByEmailOrUniqueName(String email, String uniqueName);
    User findById(int id);
    Optional<User> findByEmailAndPassword(String email, String password);



}
