package com.example.demo.resolver.query;

import com.example.demo.data.Author;
import com.example.demo.data.Post;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.PostRepository;
import com.google.common.collect.ImmutableList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class QueryResolver implements GraphQLQueryResolver {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public List<Post> recentPosts(int count, int offset) {
        final Iterable<Post> data = postRepository.findAll();
        final List<Post> posts = ImmutableList.copyOf(data);
        return posts;
    }

    public List<Post> allPosts(int count, int offset) {
        final Iterable<Post> data = postRepository.findAll();
        final List<Post> posts = ImmutableList.copyOf(data);
        return posts;
    }

    public List<Author> allAuthors(int count, int offset) {
        final Iterable<Author> data = authorRepository.findAll();
        final List<Author> authors = ImmutableList.copyOf(data);
        return authors;
    }
}
