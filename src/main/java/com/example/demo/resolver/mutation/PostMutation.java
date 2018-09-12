package com.example.demo.resolver.mutation;

import com.example.demo.data.Post;
import com.example.demo.repository.PostRepository;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PostMutation implements GraphQLMutationResolver {
    @Autowired
    private PostRepository postRepository;

    public Post writePost(String title, String text, String category) {
        final Post post = Post.builder().authorId("1").title(title).text(text).category(category).build();
        return postRepository.save(post);
    }
}
