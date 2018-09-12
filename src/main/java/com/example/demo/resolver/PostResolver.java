package com.example.demo.resolver;

import com.example.demo.data.Author;
import com.example.demo.data.Post;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.stereotype.Component;


@Component
public class PostResolver implements GraphQLResolver<Post> {
    public Author getAuthor(Post post) {
        return Author.builder().id(1).name("Author Author").build();
    }
}
