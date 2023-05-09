package com.gl.jwt.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.jwt.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
 