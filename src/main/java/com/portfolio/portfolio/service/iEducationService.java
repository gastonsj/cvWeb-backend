package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Education;
import java.util.List;

public interface iEducationService {
   
    public Education addEducation(Education education);
    public List<Education> viewEducation ();
    public void deleteEducation(Long id);
    public Education updateEducation(Education education); 
}
