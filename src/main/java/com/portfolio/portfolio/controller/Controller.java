package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.User;
import com.portfolio.portfolio.service.iUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private iUserService uServ;
    
    @GetMapping ("/hola")
    public String decirHola(){
        return "Hola Mundo";
    }
    
}
