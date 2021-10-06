package com.lab.ppi.controller;


import com.lab.ppi.model.User;
import com.lab.ppi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserRESTController {

    @Autowired
    private UserRepository useRepository;

    @GetMapping
    public List<User> findAllUsers() {
        // Implement
        return useRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable(value = "id") long id) {
        // Implement
        Optional<User> user = useRepository.findById(id);

        if(user.isPresent()) {
            return ResponseEntity.ok().body(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public User saveEmployee(@Validated @RequestBody User user) {
        // Implement
        return useRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable(value = "id") long id) {
        // Implement
        Optional<User> user = useRepository.findById(id);

        if(user.isPresent()) {
            useRepository.deleteById(id);
            return ResponseEntity.ok().body("Deleted");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}