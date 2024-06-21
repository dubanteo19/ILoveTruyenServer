package com.nonglam.ILoveTruyen.dataLoader;

import com.nonglam.ILoveTruyen.model.Chapter;
import com.nonglam.ILoveTruyen.model.ComicDetail;
import com.nonglam.ILoveTruyen.model.ContentImg;
import com.nonglam.ILoveTruyen.service.ChapterService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
@Controller
@Order(6)
public class ChapterLoader implements CommandLineRunner {
    private final ChapterService chapterService;

    public ChapterLoader(ChapterService chapterService) {
        this.chapterService = chapterService;
    }

    @Override
    public void run(String... args) throws Exception {
        var onePieceChapter1 = new Chapter();
        onePieceChapter1.setCount(1);

        var onePieceComicDetail1 = new ComicDetail();
        onePieceComicDetail1.setId(1);
        onePieceChapter1.setComicDetail(onePieceComicDetail1);

        chapterService.save(onePieceChapter1);

        var onePieceChapter1Image1 = new ContentImg(0, 1, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece-128-chap-1-0.jpg?alt=media&token=8da90f6a-c701-4fae-9ede-4972036ec768", onePieceChapter1);
        var onePieceChapter1Image2 = new ContentImg(0, 2, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-1.jpg?alt=media&token=ec9608dc-6bde-409b-8bd0-594fc7326c22", onePieceChapter1);
        var onePieceChapter1Image3 = new ContentImg(0, 3, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-2.jpg?alt=media&token=02e267f4-acb1-4584-bfc6-b7adaa1640eb", onePieceChapter1);
        var onePieceChapter1Image4 = new ContentImg(0, 4, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-3.jpg?alt=media&token=dfa254b4-c784-4f95-8a31-826a7fb63d19", onePieceChapter1);
        var onePieceChapter1Image5 = new ContentImg(0, 5, "https://firebasestorage.googleapis.com/v0/b/i-love-truyen.appspot.com/o/one-piece%2Fone-piece-128-chap-1%2Fone-piece-128-chap-1-4.jpg?alt=media&token=a81129f4-3219-4b0a-bc44-6bce700fce6d", onePieceChapter1);
        var onePieceChapter1Images = List.of(onePieceChapter1Image1, onePieceChapter1Image2, onePieceChapter1Image3,onePieceChapter1Image4, onePieceChapter1Image5);

        onePieceChapter1.setContentImgList(onePieceChapter1Images);
        chapterService.save(onePieceChapter1);

    }
}
