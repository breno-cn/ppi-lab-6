package com.lab.ppi.controller;

import com.lab.ppi.model.Post;
import com.lab.ppi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostRESTController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping
    List<Post> findAllPosts() {
        return postRepository.findAll();
    }

    @GetMapping("/{id}")
    ResponseEntity<Post> findPostById(@PathVariable(name = "id") Long id) {
        var post = postRepository.findById(id);

        return post.isPresent() ?
                ResponseEntity.ok(post.get()) :
                ResponseEntity.notFound().build();
    }

    @PostMapping
    Post createPost(@RequestBody Post post) {
         return postRepository.save(post);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable(name = "id") Long id) {
        var post = postRepository.findById(id);

        if (post.isPresent()) {
            postRepository.deleteById(id);
            return ResponseEntity.ok("Deleted");
        }

        return ResponseEntity.ok("Not found!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable(name = "id") Long id, @RequestBody Post post) {
        var postOptional = postRepository.findById(id);

        if (postOptional.isPresent()) {
            var updated = postOptional.get();
            updated.setTitle(post.getTitle());
            updated.setContent(post.getContent());

            return ResponseEntity
                    .ok(postRepository.save(updated));
        }

        return ResponseEntity
                .notFound()
                .build();
    }

}
