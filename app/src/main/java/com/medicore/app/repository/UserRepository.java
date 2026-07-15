package com.medicore.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicore.app.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByDocumentNumberAndPassword(String documentNumber, String password);
}
