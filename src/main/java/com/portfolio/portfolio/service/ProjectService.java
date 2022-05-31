package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Project;
import com.portfolio.portfolio.repository.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectService implements iProjectService{

    @Autowired
    ProjectRepository repo;

    @Override
    public Project addProject(Project project){
       return repo.save(project);
    }

    @Override
    public List<Project> viewProject() {
        return repo.findAll();
    }

    @Override
    public void deleteProject(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Project updateProject(Project project) {
        return repo.save(project);
    }
    
}
