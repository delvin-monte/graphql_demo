package com.example.demo.repository;

import com.example.demo.data.Post;

import org.springframework.data.repository.PagingAndSortingRepository;


public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

}
