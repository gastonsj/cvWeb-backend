package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.Skills;
import com.portfolio.portfolio.service.iSkillsService;
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
//@CrossOrigin(origins = "https://cv-web-3c8ec.web.app", maxAge = 3600)
@RestController
@RequestMapping("/skills")
public class SkillsController {
    @Autowired
    private iSkillsService sServ;
    
    @GetMapping("/all")
    public ResponseEntity<List<Skills>> getSkills(){      
        List<Skills> skill=sServ.viewSkills();
        return new ResponseEntity<>(skill,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Skills> updateSkills(@RequestBody Skills skill){
        Skills updateSkills = sServ.updateSkill(skill);
        return new ResponseEntity<>(updateSkills,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Skills> addSkill(@RequestBody Skills skill){
        Skills newSkill = sServ.addSkill(skill);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    } 
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") Long id){
        sServ.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
