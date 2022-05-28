package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.User;
import java.util.List;


public interface iUserService {    
    public User addUser(User user);
    public List<User> viewUser ();
    public User viewUserById(Long id);
    public void deleteUser(Long id);
    public User updateUser(User user); 
}
