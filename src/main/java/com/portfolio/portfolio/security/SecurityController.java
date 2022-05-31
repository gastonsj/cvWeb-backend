package com.portfolio.portfolio.security;

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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
//@CrossOrigin(origins = "https://cv-web-3c8ec.web.app", maxAge = 3600)
@RestController
public class SecurityController {
    
    public final String trustURL="https://cv-web-3c8ec.web.app";
    
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
    private MyUserDetailsService userDetailsService;
    
    @Autowired
    private JwtUtil jwtTokenUtil;
    
    @RequestMapping (value="/auth", method=RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{ 
      try{
          authenticationManager.authenticate(
                  new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword())
          );
      }catch(BadCredentialsException e){
          throw new Exception("Incorrect username or password",e);
      }
      final UserDetails userDetails = userDetailsService
              .loadUserByUsername(authenticationRequest.getUsername());  
      final String accessToken = jwtTokenUtil.generateToken(userDetails);
      
      return ResponseEntity.ok(new AuthenticationResponse(accessToken));
}
}

