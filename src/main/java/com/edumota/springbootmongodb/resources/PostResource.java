package com.edumota.springbootmongodb.resources;

import com.edumota.springbootmongodb.domain.Post;
import com.edumota.springbootmongodb.domain.User;
import com.edumota.springbootmongodb.dto.UserDTO;
import com.edumota.springbootmongodb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/posts")

public class PostResource {

    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
