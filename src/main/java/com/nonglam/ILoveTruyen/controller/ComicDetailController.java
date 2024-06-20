package com.nonglam.ILoveTruyen.controller;

import com.nonglam.ILoveTruyen.model.Category;
import com.nonglam.ILoveTruyen.model.ComicDetail;
import com.nonglam.ILoveTruyen.service.ComicDetailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comic-detail")
public class ComicDetailController {
    private final ComicDetailService comicDetailService;

    public ComicDetailController(ComicDetailService comicDetailService) {
        this.comicDetailService = comicDetailService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ComicDetail> findById(@PathVariable Integer id) throws Exception {
        return new ResponseEntity<>(comicDetailService.findById(id), HttpStatus.OK);
    }
    @GetMapping("/categories/{id}")
    public ResponseEntity<List<Category>> getAllCategoryById(@PathVariable Integer id)  {
        return new ResponseEntity<>(comicDetailService.getAllCategoryById(id), HttpStatus.OK);
    }

}
