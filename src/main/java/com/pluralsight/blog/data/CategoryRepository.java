package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Category;
import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


public interface CategoryRepository extends JpaRepository<Category, Long>{

    public List<Category> findAll();

    public Optional<Category> findById(Long id);

    List<Post> findByCategory(Category category);
}
