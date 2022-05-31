package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Project;
import java.util.List;

public interface iProjectService {
    
    public Project addProject(Project project);
    public List<Project> viewProject ();
    public void deleteProject(Long id);
    public Project updateProject(Project project); 
}
