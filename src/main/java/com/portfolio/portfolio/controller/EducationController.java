package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.Education;
import com.portfolio.portfolio.service.iEducationService;
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

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/education")
public class EducationController {
    
    @Autowired
    private iEducationService eServ;
    
    @GetMapping("/all")
    public ResponseEntity<List<Education>> getEducation(){      
        List<Education> edu=eServ.viewEducation();
        return new ResponseEntity<>(edu,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Education> updateEducation(@RequestBody Education edu){
        Education updateEducation = eServ.updateEducation(edu);
        return new ResponseEntity<>(updateEducation,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Education> addEducation(@RequestBody Education edu){
        Education newEducation = eServ.addEducation(edu);
        return new ResponseEntity<>(newEducation, HttpStatus.CREATED);
    } 
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") Long id){
        eServ.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
