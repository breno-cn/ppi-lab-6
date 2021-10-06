package com.lab.ppi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String content;

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
