package com.nonglam.ILoveTruyen.dataLoader;

import com.nonglam.ILoveTruyen.model.Category;
import com.nonglam.ILoveTruyen.model.ComicDetail;
import com.nonglam.ILoveTruyen.model.Status;
import com.nonglam.ILoveTruyen.service.CategoryService;
import com.nonglam.ILoveTruyen.service.ComicDetailService;
import com.nonglam.ILoveTruyen.service.ComicService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
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
        ComicDetail comicDetail = new ComicDetail();
        comicDetail.setComic(comicService.findById(1));
        comicDetail.setStatus(Status.UPDATING);
        comicDetail.setDescription("Truyen rat hay");
        comicDetail.setCategories(List.of(categoryService.findById(1), categoryService.findById(2)));
        comicDetailService.save(comicDetail);
    }
}
