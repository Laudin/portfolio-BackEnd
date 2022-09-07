package com.portfolio.app.repository;

import com.portfolio.app.models.Tecnologia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiaRepository extends JpaRepository<Tecnologia, Long> {
   
}