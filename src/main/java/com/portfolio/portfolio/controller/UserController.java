package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.User;
import com.portfolio.portfolio.service.iUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
//@CrossOrigin(origins = "https://cv-web-3c8ec.web.app", maxAge = 3600)
@RestController
@RequestMapping("/usuario")
public class UserController {
    
    @Autowired
    private iUserService uServ;
    
    @GetMapping("/id/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id){      
        User usuario=uServ.viewUserById(id);
        return new ResponseEntity<>(usuario,HttpStatus.OK);
    }
   @GetMapping("/all")
   @ResponseBody 
   public List<User> getAllUser(){
        return uServ.viewUser();
    }
    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User updateUser = uServ.updateUser(user);
        return new ResponseEntity<>(updateUser,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id){
        uServ.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
