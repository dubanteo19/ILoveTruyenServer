package com.nonglam.ILoveTruyen.dataLoader;

import com.nonglam.ILoveTruyen.model.Category;
import com.nonglam.ILoveTruyen.model.ComicDetail;
import com.nonglam.ILoveTruyen.model.Status;
import com.nonglam.ILoveTruyen.service.CategoryService;
import com.nonglam.ILoveTruyen.service.ComicDetailService;
import com.nonglam.ILoveTruyen.service.ComicService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Order(4)
public class ComicDetailLoader implements CommandLineRunner {
    private final ComicDetailService comicDetailService;
    private final ComicService comicService;
    private final CategoryService categoryService;

    public ComicDetailLoader(ComicDetailService comicDetailService, ComicService comicService, CategoryService categoryService) {
        this.comicDetailService = comicDetailService;
        this.comicService = comicService;
        this.categoryService = categoryService;
    }

    @Override
    public void run(String... args) throws Exception {
        ComicDetail OnePiececomicDetail = new ComicDetail();
        OnePiececomicDetail.setComic(comicService.findById(1));
        OnePiececomicDetail.setStatus(Status.UPDATING);
        OnePiececomicDetail.setDescription("One Piece là câu truyện kể về Luffy và các thuyền viên của mình");
        OnePiececomicDetail.setCategories(List.of(categoryService.findById(1), categoryService.findById(2)));

        ComicDetail tgdqComiccomicDetail = new ComicDetail();
        tgdqComiccomicDetail.setComic(comicService.findById(2));
        tgdqComiccomicDetail.setStatus(Status.UPDATING);
        tgdqComiccomicDetail.setDescription("Kimetsu no Yaiba – Tanjirou là con cả của gia đình");
        tgdqComiccomicDetail.setCategories(List.of(categoryService.findById(3), categoryService.findById(4)));

        ComicDetail onePunchManComiccomicDetail = new ComicDetail();
        onePunchManComiccomicDetail.setComic(comicService.findById(3));
        onePunchManComiccomicDetail.setStatus(Status.UPDATING);
        onePunchManComiccomicDetail.setDescription("Onepunch-Man là một Manga thể loại siêu anh hùng với đặc trưng phồng tôm đấm phát chết luôn… Lol!!! ");
        onePunchManComiccomicDetail.setCategories(List.of(categoryService.findById(1), categoryService.findById(2)));

        comicDetailService.save(OnePiececomicDetail);
        comicDetailService.save(tgdqComiccomicDetail);
        comicDetailService.save(onePunchManComiccomicDetail);
    }
}
