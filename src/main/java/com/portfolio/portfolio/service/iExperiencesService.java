package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Experiences;
import java.util.List;

public interface iExperiencesService {
    public Experiences addExperience(Experiences experience);
    public List<Experiences> viewExperiences ();
    public void deleteExperience(Long id);
    public Experiences updateExperiences(Experiences experience); 
}
