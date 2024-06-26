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
        var comment1 = new CommentDTO("Truyen rat hay", 1, 1);
        var comment2 = new CommentDTO("Truyen rat tuyet voi", 2, 2);
        var comment3 = new CommentDTO("Truyen rat cam dong", 3, 3);
        var comment4 = new CommentDTO("Truyen rat cam dong nha moi nguoi", 4, 4);
        var comment5 = new CommentDTO("Cau chuyen rat y nghia", 5, 5);
        var comment6 = new CommentDTO("Toi thich truyen nay", 1, 6);
        var comment7 = new CommentDTO("Truyen nay rat xuat sac", 2, 7);
        var comment8 = new CommentDTO("Truyen hay qua di", 3, 8);
        var comment9 = new CommentDTO("Mot cau chuyen cam dong", 4, 9);
        var comment10 = new CommentDTO("Truyen nay thuc su xuc dong", 5, 10);

        var comment11 = new CommentDTO("Toi khong the ngung doc", 6, 1);
        var comment12 = new CommentDTO("Mot truyen hay", 7, 2);
        var comment13 = new CommentDTO("Truyen rat tot", 8, 3);
        var comment14 = new CommentDTO("Rat hay va y nghia", 9, 4);
        var comment15 = new CommentDTO("Toi rat thich truyen nay", 10, 5);
        var comment16 = new CommentDTO("Truyen lam toi roi nuoc mat", 6, 6);
        var comment17 = new CommentDTO("Truyen qua tuyet voi", 7, 7);
        var comment18 = new CommentDTO("Truyen that la xuc dong", 8, 8);
        var comment19 = new CommentDTO("Cau chuyen rat cam dong", 9, 9);
        var comment20 = new CommentDTO("Truyen rat dang doc", 10, 10);

        var comment21 = new CommentDTO("Truyen nay khien toi cam dong", 3, 1);
        var comment22 = new CommentDTO("Mot truyen rat hay va y nghia", 3, 2);
        var comment23 = new CommentDTO("Toi khong the ngung nghi ve truyen nay", 1, 3);
        var comment24 = new CommentDTO("Cau chuyen qua hay", 1, 4);
        var comment25 = new CommentDTO("Truyen nay rat xuat sac", 2, 5);
        var comment26 = new CommentDTO("Toi se doc lai truyen nay", 2, 6);
        var comment27 = new CommentDTO("Mot truyen thuc su tuyet voi", 3, 7);
        var comment28 = new CommentDTO("Truyen nay lam toi xuc dong", 1, 8);
        var comment29 = new CommentDTO("Mot cau chuyen tuyet voi", 3, 9);
        var comment30 = new CommentDTO("Truyen nay rat an tuong", 1, 10);

        commentService.save(comment1);
        commentService.save(comment2);
        commentService.save(comment3);
        commentService.save(comment4);
        commentService.save(comment5);
        commentService.save(comment6);
        commentService.save(comment7);
        commentService.save(comment8);
        commentService.save(comment9);
        commentService.save(comment10);
        commentService.save(comment11);
        commentService.save(comment12);
        commentService.save(comment13);
        commentService.save(comment14);
        commentService.save(comment15);
        commentService.save(comment16);
        commentService.save(comment17);
        commentService.save(comment18);
        commentService.save(comment19);
        commentService.save(comment20);
        commentService.save(comment21);
        commentService.save(comment22);
        commentService.save(comment23);
        commentService.save(comment24);
        commentService.save(comment25);
        commentService.save(comment26);
        commentService.save(comment27);
        commentService.save(comment28);
        commentService.save(comment29);
        commentService.save(comment30);
    }
}
