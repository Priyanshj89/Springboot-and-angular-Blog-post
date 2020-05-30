package com.priyansh10129.ngSpring.blog.repository;

import com.priyansh10129.ngSpring.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
