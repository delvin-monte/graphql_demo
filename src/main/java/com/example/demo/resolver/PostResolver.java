package com.example.demo.resolver;

import com.example.demo.data.Author;
import com.example.demo.data.Post;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PostResolver implements GraphQLResolver<Post> {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private PostRepository postRepository;

    public Author getAuthor(Post post) {
        final Author author = new Author();
        author.setId(1L);
        author.setName("Author Author");
        return author;
    }
}
