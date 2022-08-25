package com.portfolio.app.repository;

import com.portfolio.app.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends JpaRepository<User, Long> {
   
}
