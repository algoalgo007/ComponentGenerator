package com.example.compgeneratorbe.repository;

import com.example.compgeneratorbe.domain.user.UserId;
import com.example.compgeneratorbe.domain.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, String> {
    Optional<Users> findByEmail(String email);
}
