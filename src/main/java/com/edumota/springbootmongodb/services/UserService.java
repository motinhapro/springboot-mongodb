package com.edumota.springbootmongodb.services;

import com.edumota.springbootmongodb.domain.User;
import com.edumota.springbootmongodb.repositories.UserRepository;
import com.edumota.springbootmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("User not find with id"));
    }
}
