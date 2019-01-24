package com.example.demo.repository;

import com.example.demo.data.Author;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

    List<Author> findByName(String name);
}
