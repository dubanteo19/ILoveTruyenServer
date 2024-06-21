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
        Category animeCategory = Category.builder().id(1).name("Anime").build();
        Category actionCategory = Category.builder().id(2).name("Action").build();
        Category comedyCategory = Category.builder().id(3).name("Comedy").build();
        Category manhuaCategory = Category.builder().id(4).name("Manhua").build();
        Category schoolLifeCategory = Category.builder().id(5).name("SchoolLife").build();
        categoryService.save(animeCategory);
        categoryService.save(actionCategory);
        categoryService.save(comedyCategory);
        categoryService.save(manhuaCategory);
        categoryService.save(schoolLifeCategory);
    }
}
