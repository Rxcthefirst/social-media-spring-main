package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {}
