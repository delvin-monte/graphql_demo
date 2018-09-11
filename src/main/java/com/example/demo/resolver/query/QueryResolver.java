package com.example.demo.resolver.query;

import com.example.demo.data.Author;
import com.example.demo.data.Post;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.google.common.collect.ImmutableList;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class QueryResolver implements GraphQLQueryResolver {
    public List<Post> recentPosts(int count, int offset) {
        return ImmutableList.of(
                Post.builder().title("Post #1").text("This is a post!").authorId("1").build());
    }

    public List<Post> allPosts(int count, int offset) {
        return ImmutableList.of();
    }

    public List<Author> allAuthors(int count, int offset) {
        final ImmutableList<Post> posts = ImmutableList.of(
                Post.builder().title("Post #1").text("This is a post!").authorId("1").build());
        return ImmutableList.of(
                Author.builder().id(1).name("Author Author").posts(posts).build()
        );
    }
}
