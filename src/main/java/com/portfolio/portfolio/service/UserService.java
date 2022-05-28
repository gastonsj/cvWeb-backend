package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.User;
import com.portfolio.portfolio.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements iUserService{

    private final UserRepository repo;
    
    @Autowired
    public UserService(UserRepository repo){
        this.repo=repo;
    }
    
    @Override
    public User addUser(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> viewUser() {
        return repo.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        repo.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        return repo.save(user);
    }

    @Override
    public User viewUserById(Long id) {
        return repo.findById(id).orElse(null);
    }
    
}
