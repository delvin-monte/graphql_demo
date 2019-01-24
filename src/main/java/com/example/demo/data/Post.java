package com.example.demo.data;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@Table(indexes = {
        @Index(columnList = "title"),
        @Index(columnList = "category")})
public class Post {
    @Getter(onMethod_ = {@Id, @GeneratedValue})
    private long id;

    private String title;

    private String category;

    private String text;

    @Getter(onMethod_ = {@ManyToOne, @JoinColumn(name = "author_id")})
    private Author author;
}
