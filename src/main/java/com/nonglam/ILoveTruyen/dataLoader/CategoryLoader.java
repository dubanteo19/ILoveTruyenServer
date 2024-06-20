package com.nonglam.ILoveTruyen.dataLoader;

import com.nonglam.ILoveTruyen.model.Category;
import com.nonglam.ILoveTruyen.service.CategoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;

@Controller
@Order(2)
public class CategoryLoader implements CommandLineRunner {

    private final CategoryService categoryService;
    public CategoryLoader(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @Override
    public void run(String... args) throws Exception {
        Category animeCategory = new Category(1,"Anime");
        Category actionCategory = new Category(2,"Action");
        Category ComedyCategory = new Category(3,"Comedy");
        Category ManhuaCategory = new Category(4,"Manhua");
        Category schoolLifeCategory = new Category(5,"SchoolLife");
        categoryService.save(animeCategory);
        categoryService.save(actionCategory);
        categoryService.save(ComedyCategory);
        categoryService.save(ManhuaCategory);
        categoryService.save(schoolLifeCategory);
    }
}
