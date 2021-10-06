package com.lab.ppi;

import com.lab.ppi.model.Post;
import com.lab.ppi.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class PostLoadDatabase {

    @Bean
    CommandLineRunner initPostDatabase(PostRepository postRepository) {
        return args -> {
          log.info("Creating post " + postRepository.save(new Post("title 1", "content 1")));
          log.info("Creating post " + postRepository.save(new Post("title 2", "content 2")));
          log.info("Creating post " + postRepository.save(new Post("title 3", "content 3")));
        };
    }

}
