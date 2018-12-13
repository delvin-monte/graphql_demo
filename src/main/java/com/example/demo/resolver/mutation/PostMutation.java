package com.example.demo.resolver.mutation;

import com.example.demo.data.Author;
import com.example.demo.data.Post;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.PostRepository;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class PostMutation implements GraphQLMutationResolver {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public Post writePost(String title, String text, String category) {
        Author author;
        List<Author> authors = authorRepository.findByName("Author Author");
        if (authors == null || authors.isEmpty()) {
            final Author data = new Author();
            data.setName("Author Author");
            author = authorRepository.save(data);
        } else {
            author = authors.get(0);
        }

        final Post post = new Post();
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthor(author);

        return postRepository.save(post);
    }
}
