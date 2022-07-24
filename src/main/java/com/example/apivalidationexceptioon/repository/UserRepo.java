package com.example.apivalidationexceptioon.repository;

import com.example.apivalidationexceptioon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUserId(int id);
}
