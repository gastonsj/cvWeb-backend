package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.Experiences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperiencesRepository extends JpaRepository<Experiences, Long> {
    
}
