package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Education;
import com.portfolio.portfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducationService implements iEducationService {
    
    @Autowired
    EducationRepository repo;
    

    @Override
    public Education addEducation(Education education){
       return repo.save(education);
    }

    @Override
    public List<Education> viewEducation() {
        return repo.findAll();
    }

    @Override
    public void deleteEducation(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Education updateEducation(Education education) {
        return repo.save(education);
    }
}
