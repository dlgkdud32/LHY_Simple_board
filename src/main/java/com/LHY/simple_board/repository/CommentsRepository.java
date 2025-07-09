package com.LHY.simple_board.repository;

import com.LHY.simple_board.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comment, Integer> {
}
