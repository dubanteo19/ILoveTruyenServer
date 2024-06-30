package com.nonglam.ILoveTruyen.controller;

import com.nonglam.ILoveTruyen.dto.CategoryDTO;
import com.nonglam.ILoveTruyen.model.Category;
import com.nonglam.ILoveTruyen.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<Category>> getAllCategory() {
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addCategory(@RequestBody CategoryDTO categoryDTO) {
        Category category = Category.builder().name(categoryDTO.categoryName()).build();
        return new ResponseEntity<>(categoryService.save(category),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Integer id) {
        return new ResponseEntity<>(categoryService.findById(id), HttpStatus.OK);
    }

}
