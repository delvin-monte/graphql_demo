package com.example.demo.data;

import com.google.auto.value.AutoValue;

import javax.annotation.Nullable;
import java.util.List;

@AutoValue
public abstract class Author {
    public abstract long id();
    public abstract String name();
    @Nullable public abstract String thumbnail();
    @Nullable public abstract List<Post> posts();

    public static Builder builder() {
        return new AutoValue_Author.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {

        public abstract Builder name(String name);

        public abstract Builder thumbnail(String thumbnail);

        public abstract Builder posts(List<Post> posts);

        public abstract Builder id(long id);

        public abstract Author build();
    }
}
