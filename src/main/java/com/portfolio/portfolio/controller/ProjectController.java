package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.Project;
import com.portfolio.portfolio.service.iProjectService;
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
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private iProjectService pServ;
    
    @GetMapping("/all")
    public ResponseEntity<List<Project>> getProject(){      
        List<Project> proj=pServ.viewProject();
        return new ResponseEntity<>(proj,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Project> updateProject(@RequestBody Project proj){
        Project updateProject = pServ.updateProject(proj);
        return new ResponseEntity<>(updateProject,HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Project> addProject(@RequestBody Project proj){
        Project newProject = pServ.addProject(proj);
        return new ResponseEntity<>(newProject, HttpStatus.CREATED);
    } 
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable("id") Long id){
        pServ.deleteProject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
