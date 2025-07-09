package com.edumota.springbootmongodb.services;

import com.edumota.springbootmongodb.domain.Post;
import com.edumota.springbootmongodb.repositories.PostRepository;
import com.edumota.springbootmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }

    public List<Post> findByTitle(String text) {
        return repository.findByTitleContainingIgnoreCase(text);
    }

}
