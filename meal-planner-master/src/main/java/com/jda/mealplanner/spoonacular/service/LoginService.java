package com.jda.mealplanner.spoonacular.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jda.mealplanner.model.Login;
import com.jda.mealplanner.repository.LoginRepository;

@Service
public class LoginService {
    @Autowired
    private LoginRepository repo;

    public void save(Login lng) {
        repo.save(lng);
    }

    public Optional<Login> findByUsername(String username) {
        return repo.findByUsername(username);
    }
}
