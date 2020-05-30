package com.priyansh10129.ngSpring.blog.repository;

import com.priyansh10129.ngSpring.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUserName(String username);
}
