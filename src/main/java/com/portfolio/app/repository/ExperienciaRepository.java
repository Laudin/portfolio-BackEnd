package com.portfolio.app.repository;

import com.portfolio.app.models.Experiencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
   
}
