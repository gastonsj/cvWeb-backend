package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.User;
import com.portfolio.portfolio.security.AuthenticationRequest;
import com.portfolio.portfolio.security.AuthenticationResponse;
import com.portfolio.portfolio.security.JwtUtil;
import com.portfolio.portfolio.service.iUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    public final String trustURL="https://cv-web-3c8ec.web.app";
    
    @GetMapping ("/hola")
    public String decirHola(){
        return "Hola Mundo";
    }
    
}
