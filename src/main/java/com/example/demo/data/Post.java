package com.example.demo.data;

import com.google.auto.value.AutoValue;

import javax.annotation.Nullable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@AutoValue
@AutoValue.CopyAnnotations(exclude = {Inheritance.class})
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public abstract class Post {
    @Id
    @GeneratedValue
    private long id;

    public abstract String title();
    @Nullable public abstract String category();
    @Nullable public abstract String text();
    public abstract String authorId();

    public long getId() {
        return id;
    }

    public static Builder builder() {
        return new AutoValue_Post.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder title(String title);

        public abstract Builder category(String category);

        public abstract Builder authorId(String authorId);

        public abstract Builder text(String text);

        public abstract Post build();
    }
}
