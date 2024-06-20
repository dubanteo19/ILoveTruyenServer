package com.nonglam.ILoveTruyen.dataLoader;

import com.nonglam.ILoveTruyen.model.ComicDetail;
import com.nonglam.ILoveTruyen.model.Comment;
import com.nonglam.ILoveTruyen.model.User;
import com.nonglam.ILoveTruyen.service.CommentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
@Controller
@Order(5)
public class CommentLoader implements CommandLineRunner {
    private final CommentService commentService;

    public CommentLoader(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void run(String... args) throws Exception {
        var comment = new Comment();
        var user = new User();
        user.setId(1);
        comment.setUser(user);
        comment.setText("Truyen nay rat hay nha cac ban");
        var comicDetail = new ComicDetail();
        comicDetail.setId(1);
        comment.setComicDetail(comicDetail);
        commentService.save(comment);
    }
}
