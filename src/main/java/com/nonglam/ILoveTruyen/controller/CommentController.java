package com.nonglam.ILoveTruyen.controller;

import com.nonglam.ILoveTruyen.dto.CommentDTO;
import com.nonglam.ILoveTruyen.model.Comment;
import com.nonglam.ILoveTruyen.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public ResponseEntity<List<Comment>> getAllComments() {
        return new ResponseEntity<>(
                commentService.findAll(),HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> saveComment(@RequestBody CommentDTO commentDTO) throws Exception {
        var comment = commentService.save(commentDTO);
        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    @DeleteMapping("/{commentId}")
    public ResponseEntity<?> updateComment(@PathVariable Integer commentId) throws Exception {
        var updatedComment = commentService.delete(commentId);
        return new ResponseEntity<>(updatedComment, HttpStatus.OK);
    }
    @PutMapping("/{commentId}")
    public ResponseEntity<?> updateComment(@PathVariable Integer commentId,@RequestBody CommentDTO commentDTO) throws Exception {
        var updatedComment = commentService.update(commentDTO, commentId);
        return new ResponseEntity<>(updatedComment, HttpStatus.OK);
    }
}

