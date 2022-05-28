package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Skills;
import com.portfolio.portfolio.repository.SkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsServices implements iSkillsService {

    @Autowired
    SkillsRepository repo;
        
    @Override
    public Skills addSkill(Skills skill) {
        return repo.save(skill);
    }

    @Override
    public List<Skills> viewSkills() {
        return repo.findAll();
    }

    @Override
    public Skills viewSkillById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteSkill(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Skills updateSkill(Skills skill) {
        return repo.save(skill);
    }
    
}
