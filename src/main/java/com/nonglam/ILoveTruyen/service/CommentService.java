package com.nonglam.ILoveTruyen.service;

import com.nonglam.ILoveTruyen.dto.CommentDTO;
import com.nonglam.ILoveTruyen.model.Comment;
import com.nonglam.ILoveTruyen.repository.CommentRepository;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final UserService userService;
    private final ComicDetailService comicDetailService;

    public CommentService(CommentRepository commentRepository, UserService userService, ComicDetailService comicDetailService) {
        this.commentRepository = commentRepository;
        this.userService = userService;
        this.comicDetailService = comicDetailService;
    }

    public Comment save(CommentDTO commentDTO) throws Exception {
        Comment comment = new Comment();
        comment.setUser(userService.findById(commentDTO.userId()));
        comment.setComicDetail(comicDetailService.findById(commentDTO.comicDetailId()));
        comment.setText(commentDTO.text());
        return commentRepository.save(comment);
    }

    public Comment update(CommentDTO commentDTO, Integer commentId) throws Exception {
        Optional<Comment> existingComment = commentRepository.findById(commentId);
        if (existingComment.isEmpty()) throw new Exception("comment not found");
        Comment comment = existingComment.get();
        System.out.println(commentDTO.text());
        comment.setText(commentDTO.text());
        commentRepository.save(comment);
        return commentRepository.findById(commentId).get();
    }


    public List<Comment> findAll() {
        return commentRepository.findAll();
    }


    public boolean delete(Integer commentId) {
       commentRepository.deleteById(commentId);
       return true;
    }
}
