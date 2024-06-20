package com.nonglam.ILoveTruyen.service;

import com.nonglam.ILoveTruyen.model.Category;
import com.nonglam.ILoveTruyen.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public Category findById(Integer category_id) {
        return categoryRepository
                .findById(category_id)
                .orElseThrow();
    }
}
