package com.example.demo.data;

import lombok.Data;
import lombok.Getter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(indexes = {@Index(columnList = "name")})
public class Author {
    @Getter(onMethod_ = {@Id, @GeneratedValue})
    private long id;

    private String name;

    private String thumbnail;

    @Getter(onMethod_ = {@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)})
    private List<Post> posts;
}
