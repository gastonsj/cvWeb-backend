package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Skills;
import java.util.List;


public interface iSkillsService {
    
    public Skills addSkill(Skills skill);
    public List<Skills> viewSkills ();
    public Skills viewSkillById(Long id);
    public void deleteSkill(Long id);
    public Skills updateSkill(Skills skill); 
}
