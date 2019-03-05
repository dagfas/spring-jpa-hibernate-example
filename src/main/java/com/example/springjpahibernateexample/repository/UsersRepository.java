package com.example.springjpahibernateexample.repository;

import com.example.springjpahibernateexample.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
