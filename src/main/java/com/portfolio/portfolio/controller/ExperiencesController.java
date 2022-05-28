package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.PortfolioApplication;
import com.portfolio.portfolio.model.Experiences;
import com.portfolio.portfolio.service.iExperiencesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://cv-web-3c8ec.web.app", maxAge = 3600)
@RestController
@RequestMapping("/experience")
public class ExperiencesController {
    @Autowired
    private iExperiencesService eServ;
    
    @GetMapping("/all")
    public ResponseEntity<List<Experiences>> getExperiences(){      
        List<Experiences> expe=eServ.viewExperiences();
        return new ResponseEntity<>(expe,HttpStatus.OK);
    }
    @PutMapping("/update")  
    public ResponseEntity<Experiences> updateExperiences(@RequestBody Experiences expe){
        Experiences updateExperiences = eServ.updateExperiences(expe);
        return new ResponseEntity<>(updateExperiences,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Experiences> addExperiences(@RequestBody Experiences expe){
        Experiences newExperiences = eServ.addExperience(expe);
        return new ResponseEntity<>(newExperiences, HttpStatus.CREATED);
    } 
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable("id") Long id){
        eServ.deleteExperience(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
