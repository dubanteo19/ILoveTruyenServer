package com.nonglam.ILoveTruyen.service;

import com.nonglam.ILoveTruyen.model.Comment;
import com.nonglam.ILoveTruyen.repository.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment save(Comment comment){
        return commentRepository.save(comment);
    }
}
