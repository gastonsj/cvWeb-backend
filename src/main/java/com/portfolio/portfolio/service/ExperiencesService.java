/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Experiences;
import com.portfolio.portfolio.repository.ExperiencesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperiencesService implements iExperiencesService {
    @Autowired
    ExperiencesRepository repo;
    
    @Override
    public Experiences addExperience(Experiences experience) {
        return repo.save(experience);
    }

    @Override
    public List<Experiences> viewExperiences() {
        return repo.findAll();
    }

    @Override
    public void deleteExperience(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Experiences updateExperiences(Experiences experience) {
        return repo.save(experience);
    }
    
}
