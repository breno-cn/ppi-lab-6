package com.lab.ppi.controller;

import com.lab.ppi.model.Subject;
import com.lab.ppi.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lab4")
public class LabController {

    @GetMapping("/add")
    public @ResponseBody String addUser(@RequestParam(value = "name") String name,
                                        @RequestParam(value = "email") String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);

        return user.toString();
    }

    @GetMapping("/addSubject")
    public ResponseEntity<String> addSubject(@RequestParam(value = "name") String name,
                                             @RequestParam(value = "description") String description,
                                             @RequestParam(value = "hoursPerWeek") Long hoursPerWeek) {
        Subject subject = Subject.builder()
                .name(name)
                .description(description)
                .hoursPerWeek(hoursPerWeek)
                .build();

        return ResponseEntity
                .ok(subject.toString());
    }

}
