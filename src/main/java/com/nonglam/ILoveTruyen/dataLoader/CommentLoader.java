package com.nonglam.ILoveTruyen.dataLoader;

import com.nonglam.ILoveTruyen.dto.CommentDTO;
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
        var comment1 = new CommentDTO("Truyen rat hay",1,1);
//        var comment2 = new CommentDTO("Truyen rat tuyet voi",1,2);
//        var comment3 = new CommentDTO("Truyen rat cam dong",1,3);
//        var comment4 = new CommentDTO("Truyen rat cam dong nha moi nguoi",1,4);
        commentService.save(comment1);
//        commentService.save(comment2);
//        commentService.save(comment3);
//        commentService.save(comment4);
    }
}
