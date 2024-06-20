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
        var chapter1 = new Chapter();
        chapter1.setCount(1);
        var comicDetail1 = new ComicDetail();
        comicDetail1.setId(1);
        chapter1.setComicDetail(comicDetail1);
        chapterService.save(chapter1);
        var image1 = new ContentImg(0,1,"hinh1",chapter1);
        var image2 = new ContentImg(0,2,"hinh2",chapter1);
        var image3 = new ContentImg(0,3,"hinh3",chapter1);
        var images = List.of(image1,image2,image3);
        chapter1.setContentImgList(images);
        chapterService.save(chapter1);
    }
}
